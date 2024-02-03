package main;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("---------------------------------------------------------------------------------------");
		System.out.print("\n\nWelcome to the Blood Donation System.");
		System.out.print("\nEnter,\n1 if you're an Admin\n2 if you're a Donor\n3 if you're a Patient\n4 to quit: ");
		int choice = input.nextInt();
		while(choice<1||choice>4) {
			System.out.print("\nInvalid input, please try again.");
			System.out.print("\nEnter 1 if you're an Admin\n2 if you're a Donor\n3 if you're a Patient\n4 to quit: ");
			choice = input.nextInt();
		}
		
		switch(choice) {
			case 1:
				Admin.main(args);
				break;
			case 2:
				Donor.main(args);
				break;
			case 3:
				Patient.main(args);
				break;
		}
		
	}
}
