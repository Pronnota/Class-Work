package Class_Work8;

import java.util.Scanner;

public class MenuDrivenProgram {
	
	public static void science() {
		while(true){
		Scanner sc=new Scanner(System.in);
		System.out.println("\n:Subjects:");
		//To print the Menu Under Science Stream.
		System.out.println("1.Physics."+" 2.Chemistry."+" 3.Zoology."+" 4.Botany."+" 5.Math\n");
		System.out.print("Choose 1 Subject from the given Menu: ");
		int ch1=sc.nextInt();		//User Input for Subject
		System.out.println();
		switch(ch1) {				
		case 1:{					//Information about the elected subject
			System.out.println("You've Opted For Physics.The Subjects under this course are Core Papers(1-14),DSE And Sec. Are You sure about that?");
			System.out.println("1.Yes"+" "+"2.No");
			int ch2=sc.nextInt();
			if (ch2==1) {   		//To check if they willing to take selected subject
				System.out.println("Congratulations.");
				break;
			}
			else					// If not sure show the menu again to choice again
				continue;
				}
		case 2:{					//Information about the elected subject
			System.out.println("You've Opted For Chemistry.The Subjects under this course are Core Papers(1-14),DSE And Sec. Are You sure about that?");
			System.out.println("1.Yes"+" "+"2.No");
			int ch2=sc.nextInt();
			if (ch2==1) {			//To check if they willing to take selected subject
				System.out.println("Congratulations.");
				break;
			}
			else					// If not sure show the menu again to choice again
				continue;	
		}
		case 3:{					//Information about the elected subject
			System.out.println("You've Opted For Zoology.The Subjects under this course are Core Papers(1-14),DSE And Sec. Are You sure about that?");
			System.out.println("1.Yes"+" "+"2.No");
			int ch2=sc.nextInt();
			if (ch2==1) {			//To check if they willing to take selected subject
				System.out.println("Congratulations.");
				break;
			}
			else					// If not sure show the menu again to choice again
				continue;
		}
		case 4:{					//Information about the elected subject
			System.out.println("You've Opted For Botany.The Subjects under this course are Core Papers(1-14),DSE And Sec. Are You sure about that?");
			System.out.println("1.Yes"+" "+"2.No");
			int ch2=sc.nextInt();
			if (ch2==1) {			//To check if they willing to take selected subject
				System.out.println("Congratulations.");
				break;
			}
			else					// If not sure show the menu again to choice again
				continue;
		}
		case 5:{					//Information about the elected subject
			System.out.println("You've Opted For Math.The Subjects under this course are Core Papers(1-14),DSE And Sec. Are You sure about that?");
			System.out.println("1.Yes"+" "+"2.No");
			int ch2=sc.nextInt();
			if (ch2==1) {			//To check if they willing to take selected subject
				System.out.println("Congratulations.");
				System.exit(0);
				}
			else					// If not sure show the menu again to choice again
				continue;
			}
		}
		break; // TO break the while loop.
	}
		
		
}
	public static void arts() {
		while(true){
		Scanner sc=new Scanner(System.in);
		System.out.println("\n:Subjects:");
		//To print the Menu Under Science Stream.
		System.out.println("1.Bengali."+" 2.English."+" 3.History."+" 4.Geography."+" 5.Pol Science\n");
		System.out.print("Choose 1 Subject from the given Menu: ");
		int ch1=sc.nextInt();		//User Input for Subject
		System.out.println();
		switch(ch1) {				
		case 1:{					//Information about the elected subject
			System.out.println("You've Opted For Bengali.The Subjects under this course are Core Papers(1-14),DSE And Sec. Are You sure about that?");
			System.out.println("1.Yes"+" "+"2.No");
			int ch2=sc.nextInt();
			if (ch2==1) {			//To check if they willing to take selected subject
				System.out.println("Congratulations.");
				break;
			}
			else					// If not sure show the menu again to choice again
				continue;
				}
		case 2:{
			System.out.println("You've Opted For English.The Subjects under this course are Core Papers(1-14),DSE And Sec. Are You sure about that?");
			System.out.println("1.Yes"+" "+"2.No");
			int ch2=sc.nextInt();
			if (ch2==1) {
				System.out.println("Congratulations.");
				break;
			}
			else
				continue;	
		}
		case 3:
		{
			System.out.println("You've Opted For History.The Subjects under this course are Core Papers(1-14),DSE And Sec. Are You sure about that?");
			System.out.println("1.Yes"+" "+"2.No");
			int ch2=sc.nextInt();
			if (ch2==1) {
				System.out.println("Congratulations.");
				break;
			}
			else
				continue;
		}
		case 4:{
			System.out.println("You've Opted For Geography.The Subjects under this course are Core Papers(1-14),DSE And Sec. Are You sure about that?");
			System.out.println("1.Yes"+" "+"2.No");
			int ch2=sc.nextInt();
			if (ch2==1) {
				System.out.println("Congratulations.");
				break;
			}
			else
				continue;
		}
		case 5:{
			System.out.println("You've Opted For Pol Science.The Subjects under this course are Core Papers(1-14),DSE And Sec. Are You sure about that?");
			System.out.println("1.Yes"+" "+"2.No");
			int ch2=sc.nextInt();
			if (ch2==1) {
				System.out.println("Congratulations.");
				System.exit(0);
			}
			else
				continue;
		}
	}
		break;  // To break the while loop
	}
		
		
}


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Calcutta University");
		System.out.println("Streams we offer");
		//Menu
		do {
			System.out.println();
			System.out.println("1.Science");
			System.out.println("2.Arts");
			//Choice 
			System.out.print("Enter Your choice:");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:{
				//If they choose science stream call science method
				System.out.println("You've Choosen Stream Science. And Here are the subjects we offer under Science.");
				science();
				System.exit(0);
					}
			case 2:{
				//If they choose arts stream call science method
				System.out.println("You've Choosen Stream Arts. And Here are the subjects we offer under Arts.");
				arts();
				System.exit(0);
					}
				}
		}while(true);
			
	}
}
