package Class_Work8;

class User
{
	//Instance Variables
	int id;
	String name,address;
	public User(int id,String name,String address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	//To Display User Data
	public void display()
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
}

//Child class of User class
class Emp extends User
{
	//Instance Variable
	double salary;
	String designation;
	
	public Emp(int id,String name,String address,double salary,String designation)
	{
		super(id,name,address);
		this.salary=salary;
		this.designation=designation;
	}
	
	//To get Employee Data 
	public void getData()
	{
		display();
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+designation);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		Emp emp1=new Emp(100,"Pronnota","Kolkata",50000,"Student");
		emp1.getData();
		
	}

}
