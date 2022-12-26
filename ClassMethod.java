package Class_Work5;

class Student{
	
	//Instance variables
	int id;
	String name,address;
	long Ph_No;
	
	//Method To assign data or pass arguments
	public void SetData(int i,String nm,String add,long ph) {
		
		id=i;
		name=nm;
		address=add;
		Ph_No=ph;
		
	}
	
	//Method to get data 
	public void GetData() {
		
		System.out.println("Id: "+id+"\nName: "+name+"\nAddress: "+address+"\nPhone Number: "+Ph_No);
		System.out.println();
		
	}
	
	
}


public class ClassMethod{
	
	public static void main(String[] args) {
		
		//Object creation for each Student
		
		Student Pronnota=new Student();
		Student X=new Student();
		
		//Value assignment for each object
		Pronnota.SetData(100,"Pronnota Mandal","South Dinajpur",9735079073l);
		X.SetData(101,"X","YZ",4894394039l);
		
		Pronnota.GetData();
		X.GetData();
		
		
	}
	
	
}