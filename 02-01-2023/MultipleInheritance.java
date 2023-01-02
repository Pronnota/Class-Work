package Class_Work15;

interface Printable1{
	void display();
	void fun();
}

interface Drawable extends Printable1{
	
	void draw();
	
}

interface Sayable{
	void say();
}

class Print1 implements Drawable{

	@Override
	public void display() {
		System.out.println("This is display() method from class Print1 which implements Drawable which extends Printable1");
		
	}

	@Override
	public void fun() {
		System.out.println("This is fun() method from class Print1 which implements Drawable which extends Printable1");
		
	}

	@Override
	public void draw() {
		System.out.println("This is draw() method from class Print1 which implements Drawable which extends Printable1");
		
	}
	
}

class Message1 implements Drawable,Sayable{

	@Override
	public void display() {
		System.out.println("This is display() method from class Message which implements Drawable which extends Printable1");
		
	}

	@Override
	public void fun() {
		System.out.println("This is fun() method from class Print1 which implements Drawable which extends Printable1");
		
	}

	@Override
	public void say() {
		System.out.println("This is say() method from class Print1 which implements Sayable");
		
	}

	@Override
	public void draw() {
		System.out.println("This is draw() method from class Print1 which implements Drawable which extends Printable1");
		
	}
	
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		
		Print1 p1=new Print1();
		p1.display();
		p1.fun();
		p1.draw();
		Message1 m1=new Message1();
		m1.display();
		m1.draw();
		m1.fun();
		m1.say();
		

	}

}
