package Class_Work;

public class TypeCasting {

	public static void main(String[] args) {
		double a=4474.566883949;
		
		//Narrowing
		float N1=(float)a;
		long N2=(long)N1;
		int N3=(int)N2;
		
		System.out.println("Narrowing: double -> float -> long -> int");
		System.out.println(a+" -> "+N1+" -> "+N2+" -> "+N3);
		
		int b=1272893899;
		//Widening
		long W1=(long)b;
		float W2=(float)W1;
		double W3=(double)W2;
		
		System.out.println("Widening: int -> long -> float -> double");
		System.out.println(b+" -> "+W1+" -> "+W2+" -> "+W3);
		
		
	}

}
