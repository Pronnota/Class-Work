package Class_Work5;

class Student2{
	
	//Instance Variables
	int id;
	String Name,Address;
	long Ph;
	
	//Constructor
	public Student2(int i,String name,String add,long ph) {
		
		id=i;
		Name=name;
		Address=add;
		Ph=ph;
		
	}
	
	//Method to get date
	public void Getdata() {
		
		System.out.println("ID:"+id+"\nName:"+Name+"\nAddress:"+Address+"\nPh Number:"+Ph);
		System.out.println();
		
	}
	
}

public class ClassConstructor {
	
	public static void main(String[] args) {
		
		Student2 Pronnota=new Student2(100,"Pronnota Mandal","Buniadpur",9735079073l);
		Student2 X=new Student2(101,"X","YZ",92329382302l);
		
		//To get Data
		Pronnota.Getdata();
		X.Getdata();
		
	}

}

//For Constructor we dont need to create object every time.
