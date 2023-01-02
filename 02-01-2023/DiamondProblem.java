package Class_Work15;

//Interface A
interface A{
	void a();
}

//Interface B which extends A
interface B extends A{
	void b();
}

//Interface C extends A
interface C extends A{
	void c();
}

//Interface D extends B&C
interface D extends B,C{
	void d();
}

//Class ABC implements B,C
class ABC implements B,C{
	
	@Override
	public void a() {
		System.out.println("This is a() from interface A");
		
	}
	
	@Override
	public void b() {
		System.out.println("This is b() from interface B which extends A");
		
	}
	
	@Override
	public void c() {
		System.out.println("This is c() from interface C which extends A");
		
	}
}

//Class ABC implements D which extends B,C
class ABC2 implements D{
	
	@Override
	public void a() {
		System.out.println("This is a() from interface D which implements B which extends A");
		
	}
	
	@Override
	public void b() {
		System.out.println("This is b() from interface D");
		
	}
	
	@Override
	public void c() {
		System.out.println("This is c() from interface D");
		
	}
	
	@Override
	public void d() {
		System.out.println("This is d() from interface D");
		
	}
}

public class DiamondProblem {

	public static void main(String[] args) {
		
		ABC ab=new ABC();
		ab.a();
		ab.b();
		ab.c();
		System.out.println();
		ABC2 ab2=new ABC2();
		ab2.a();
		ab2.b();
		ab2.c();
		ab2.d();

	}

}
