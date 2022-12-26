package Class_Work5;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int bal=6900;
		int curbal=bal,withdraw,choice,choice2=1;
		while(choice2!=2) {
			System.out.print("Enter the Withdraw amount:");
			withdraw=sc.nextInt();
			if (curbal>=withdraw) {
				
				curbal=curbal-withdraw;
				System.out.println("Withdraw successful and your current bal. is:"+curbal+"/-");
				System.out.println("Do you want to withdraw again?\n"+"1.Yes "+"2.No");
				choice2=sc.nextInt();
				
			}
			else
			{
				System.out.println("Insufficient Bal.");
				System.out.println("Do you want to deposit 5000/-");
				System.out.println("1.Yes "+"2.No");
				choice=sc.nextInt();
				if (choice==1) {
					curbal+=5000;
					System.out.println("Amount depositied and current bal."+curbal);
					System.out.println("Do you want to withdraw again?\n"+"1.Yes "+"2.No");
					choice2=sc.nextInt();
					continue;
					
					}
				else {
					System.out.println("Try again to withdraw with lower amount.");
					
					}
				
				
			}
		}
		
	}

}
