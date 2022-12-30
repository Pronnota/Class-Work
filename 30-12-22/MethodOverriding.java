package Class_Work8;

class ParentBank  //Parent class
{
	public void loanInterest()
	{
		System.out.println("9% Interest.");
	}
}

//Method overriding from Parent class
class ChildSbi extends ParentBank
{
	public void loanInterest() {
		System.out.println("7.75% Interest.");
	}
}

//Method overriding from Parent class
class ChildAxis extends ParentBank
{
	public void loanInterest()
	{
		System.out.println("10% Interest.");
	}
}

//Method overriding from Parent class
class ChildHdfc extends ParentBank
{
	public void loanInterest()
	{
		System.out.println("12% Interest.");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		ParentBank pb;
		pb=new ChildSbi();	//Upcasting
		pb.loanInterest();
		pb=new ChildHdfc();
		pb.loanInterest();
		pb=new ChildAxis();
		pb.loanInterest();

	}

}
