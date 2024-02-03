package main;
import java.util.Scanner;

public class Patient {

	public static void main(String[] args) {
		boolean donated = false;
		int[][] bloodReceive = {
			      {0, 4, 1, 5}, 
			      {1, 5}, 
			      {2, 6, 1, 5}, 
			      {0, 1, 2, 3 , 4 , 5, 6, 7}, 
			      {4, 5}, 
			      {5}, 
			      {6, 5}, 
			      {7, 4, 6, 5}, 
			};
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nWelcome Patient!!");
		System.out.print("\n\n");
		for(int i =0;i<8;i++){
			System.out.println(i + " =\t" + BloodBank.bloodTypes[i]);
		}
		System.out.print("Enter your blood type : ");
		int patientType = input.nextInt();
		while(patientType<0||patientType>7) {
			System.out.print("Invalid Input,try again: ");
			patientType = input.nextInt();
		}
		for(int i =0;i<bloodReceive[patientType].length;i++) {
			if(BloodBank.amountBlood(bloodReceive[patientType][i])>0) {
				BloodBank.removeBlood(bloodReceive[patientType][i],1);
				System.out.println("\nYou will be donated 1 packet of blood.\nTo get more packets please login again.");
				donated = true;
				break;
			}
		}
		
		if(donated==false) {
			System.out.println("\nNo compatible blood avalible to donate.");

		}
		
		System.out.println("Compatible blood avalible: ");
		for(int i =0;i<bloodReceive[patientType].length;i++) {
			System.out.println(BloodBank.bloodTypes[bloodReceive[patientType][i]] + ":\t" + BloodBank.amountBlood(bloodReceive[patientType][i]));
		}
		
		System.out.print("\nType logout to logout: ");
		String confirm = input.next();
		Driver.main(args);	
	}

}
