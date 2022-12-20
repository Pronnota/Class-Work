package Class_Work;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
		// For Rectangle
		
		System.out.println("Enter the value of the sides :");
		Scanner sc=new Scanner(System.in);
		System.out.print("A: ");
		int A =sc.nextInt();
		System.out.print("B: ");
		int B=sc.nextInt();
				
		int area_rect,perimeter_rect;
		area_rect=A*B;
		perimeter_rect=2*(A+B);
		System.out.println("Area of the rectangle is = "+area_rect);
		System.out.println("Perimeter of the rectangle is ="+perimeter_rect);
				

	}

}
