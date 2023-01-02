package Class_Work15;

//Abstract class
abstract class A100{
	
	abstract void display();
	public void demo() {
		System.out.println("Demo");
	}
}

//Interface In 
interface In{
	public int add(int a,int b);
}

//class Child1 extends A100 and implements In to calculate & show sum value
class Child1 extends A100 implements In{
	
	@Override
	void display() {
		System.out.println("Ans is: ");
		
	}
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
}

public class Interface2 {
	
	public static void main(String[] args) {
		
		//Object creation
		Child1 ch=new Child1();
		ch.display();
		int sum=ch.add(10,20);
		System.out.println(sum);
		ch.demo();
		
	}

}
