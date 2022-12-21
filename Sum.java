package Class_Work.idk;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int Num= sc.nextInt();
		int sum=0; // Variable to store summation value
		
		for(int i=1;i<=Num;i++) {
			
			sum+=i;
			
		}
		
		System.out.println("The summation value of "+Num+" terms is :"+sum);
		
	}

}
