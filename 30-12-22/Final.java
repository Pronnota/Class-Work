package Class_Work8;
/*final*/ class Bike
{
	final void speed() {
		System.out.println("150KMH");
	}
}
public class Final extends Bike{
//	void speed()
//	{
//		System.out.println("160KMH");
//	}
	final int a=10;

	public static void main(String[] args) {
		
		Final f=new Final();
		//f.a=100;// We can not assign value to final variable
		System.out.println(f.a);

	}

}
