package Class_Work.idk;

import java.util.Scanner;

public class NoOfDigit {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int c=0;  // Counter
		/*Now we have to divide the number by 10 
		 until its not equal to zero and keep updating the num with the reminder
		 and for each successful division we increment the counter by 1*/ 
		
		while(num!=0) {
			
			num/=10;
			c++;
		}
		
		System.out.println("The no of digits in "+num+" is: "+c);
		
	}

}
