package main;
import java.util.Scanner;

public class Admin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter your password: ");
		
		String pass = input.next();
		
		while(pass.compareTo("sahar")!=0) {
			System.out.print("\nIncorrect password\ntry again or type logout to logout: ");
			pass = input.next();
			if(pass.equals("logout")) {
				Driver.main(args);
			}
		}
		
		System.out.print("\nWelcome!!!\nBlood Available:\n");
		for(int i =0;i<8;i++){
			System.out.println(BloodBank.bloodTypes[i]+ ":\t" + BloodBank.amountBlood(i));
		}


		System.out.print("\nType logout to logout: ");
		String confirm = input.next();
		Driver.main(args);
		
	}

}
