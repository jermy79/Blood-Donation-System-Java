package main;

public class BloodBank {

	private static int[] bloodGroup = {0,0,0,0,0,0,0,0};
	public static String[] bloodTypes = {"A+","O+","B+","AB+","A-","O-","B-","AB-"};
	
	static void addBlood(int type, int amount) {
		bloodGroup[type]+=amount;
	}
	static void removeBlood(int type, int amount) {
		bloodGroup[type]--;
	}
	
	static int amountBlood(int type) {
		return bloodGroup[type];
	}

}
