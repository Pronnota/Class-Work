package Class_Work15;

//This is an Abstract Class
abstract class Bank{
	
	//This is an Abstract Method
	abstract public void getLoanInterest();
	
	//This is a concrete class
	public void display() {
		System.out.println("This is bank class");
	}
	
}

//Child class Sbi extend Bank
class sbi extends Bank{

	@Override
	public void getLoanInterest() {
		System.out.println("6.9% Interest");	
	}
	
}

//Another class hdfc extends Bank
class hdfc extends Bank{

	@Override
	public void getLoanInterest() {
		System.out.println("10% Interest");
	}
}

public class Abstract {
	
	public static void main(String[] args) {
		
		//Object creation
		Bank b=new sbi();
		b.display();
		b.getLoanInterest();
		b=new hdfc();
		b.display();
		b.getLoanInterest();
		
	}

}
