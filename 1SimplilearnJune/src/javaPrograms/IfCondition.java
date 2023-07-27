package javaPrograms;

public class IfCondition {

	public static void main(String[] args) {		
		//basicPrint();
		int a = 10;
		//Simple if
		if(a>20) {
			System.out.println("a is greater than 20");
			System.out.println("a is greater than 20");
			System.out.println("a is greater than 20");
			System.out.println("a is greater than 20");
		}
		
		//If else
		if(a>20) {
			System.out.println("a is greater than 20");
			System.out.println("a is greater than 20");
			System.out.println("a is greater than 20");
			System.out.println("a is greater than 20");
		}else {
			System.out.println("a is less than 20");
		}
		
		//if else if
		int marksPercent = 75;
		if(marksPercent >= 60) {
			System.out.println("First Class");
			//nested if
			if(marksPercent >= 80) {
				System.out.println("Distinction");
			}
		}else if(marksPercent < 60 && marksPercent >=50) {
			System.out.println("Second Class");
		}else if(marksPercent < 50 && marksPercent >=35) {
			System.out.println("Third Class / Ordinary Pass");
		}else {
			System.out.println("Failed");
		}
	}

	/*
	public static void basicPrint() {
		System.out.println("This is a method outside puboic static void main");
	}*/
}
