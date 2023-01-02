package Class_Work15;

//This is an Interface
interface Printable{
	
	int x=100;
	void display();		//Abstract by Default
	void fun();			
	
}

//Classes Implements interfaces
class Print implements Printable
{
	@Override
	public void display() {
		System.out.println("This is display from Print class which implements Printable");
		
	}
	
	@Override
	public void fun() {
		System.out.println("This is fun from Print class which implements Printable");
		
	}
}

//Another Implementation of Printable
class Message implements Printable{
	@Override
	public void display() {
		System.out.println("This is display from class Message which implements Printable");
		
	}
	@Override
	public void fun() {
		System.out.println("This is fun from class Message which implements Printable");
		
	}
	
}

public class Interface {

	public static void main(String[] args) {
		
		Printable p;	//Upcasting
		p=new Print();
		p.display();
		p.fun();
		p=new Message();
		p.display();
		p.fun();

	}

}
