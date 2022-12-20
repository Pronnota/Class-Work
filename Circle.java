package Class_Work;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		float pi=3.1415f;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the radious of the Circle :"); //User input for radius
		int r=sc.nextInt();
		
		float area,perimeter;
		area=pi*r*r;
		perimeter=2*pi*r;
		
		System.out.println("Area of the circle is "+area+" and the perimeter is given by "+perimeter);
		

	}

}
