package javaPrograms;

class Bank{//Parent Class
	String branchName;
	int brCode;
	String bankName;
	
	public void giveLoans() {
		System.out.println("giveLoans Method");
	}
	
	public void takeDeposits() {
		System.out.println("takeDeposits Method");
	}
}

class HDFCBank extends Bank{//Child Class
	public void specialAction1() {
		System.out.println("specialAction1");
	}
}

public class UseInheritance {

	public static void main(String[] args) {
		HDFCBank hdfc = new HDFCBank();
		hdfc.bankName = "HDFC";
		hdfc.branchName = "Koramangala";
		hdfc.brCode = 352;
		
		hdfc.giveLoans();
		hdfc.takeDeposits();
		hdfc.specialAction1();
	}

}
