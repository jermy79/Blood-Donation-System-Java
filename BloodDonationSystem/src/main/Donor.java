package main;
import java.util.Scanner;

public class Donor {

	public static void main(String[] args) {
		String donorName="null",donorSex="null",donationMonth="null",donationDay="null",donationYear ="null";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nWelcome Donor!!");
		
		System.out.print("\nEnter 1 if you'd like to enter your information: ");
		String info = input.next();
		
		if(info.equalsIgnoreCase("1")) {
			System.out.print("\nEnter your name: ");
			donorName = input.next();
			System.out.print("Enter your sex: ");
			donorSex = input.next();
			System.out.print("Enter todays Date (MM DD YY) :");
			donationMonth = input.next();
			donationDay = input.next();
			donationYear = input.next();
		}
		
		System.out.print("\n");
		for(int i =0;i<8;i++){
			System.out.println(i + " =\t" + BloodBank.bloodTypes[i]);
		}
		System.out.print("Enter type of blood you'd like to donate: ");
		int donationType = input.nextInt();
		while(donationType<0||donationType>7) {
			System.out.print("Invalid Input,try again: ");
			donationType = input.nextInt();
		}
		System.out.print("Enter amount of packets you'd like to donate (max 3): ");
		int donationAmount = input.nextInt();
		while(donationAmount<1||donationAmount>3) {
			System.out.print("Invalid Input,try again: ");
			donationAmount = input.nextInt();
		}
		BloodBank.addBlood(donationType, donationAmount);
		
		if(info.equalsIgnoreCase("1")) {
			System.out.print("Enter 1 if you'd like to print your information: ");
			String infoPrint= input.next();
			if(infoPrint.equalsIgnoreCase("1")) {
				System.out.print("\nName: " + donorName);
				System.out.print("\nDate of Donation: " + donationMonth + "/" + donationDay + "/" + donationYear);
				System.out.print("\nBlood Type Donated: " + donationAmount + " packets of " + BloodBank.bloodTypes[donationType] + " type blood");

			}
		}

		
		System.out.print("\n\nThank you for your Donation!");

		
		
		System.out.print("\nType logout to logout: ");
		String confirm = input.next();
		Driver.main(args);	
		
	}

}
