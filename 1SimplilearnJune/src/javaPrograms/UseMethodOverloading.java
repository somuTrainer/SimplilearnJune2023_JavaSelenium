package javaPrograms;

class ArithmeticCalc{
	
	public void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("The added value of a and b: "+c);
	}
	
	public int add(int a, int b) {
		int c = a + b;
		System.out.println("The added value of a and b: "+c);
		return c;	
	}
	
	public void add(int a, double b) {
		double c = a + b;
		System.out.println("The added value of a and b: "+c);
	}
	
	public void add(double b, int a) {
		double c = a + b;
		System.out.println("The added value of a and b: "+c);
	}	
	
	public void add(String a, String b) {
		//String a = "Hi Hello";
		//String b = "How are you today";
		String c = a + b;
		System.out.println("The added value of a and b: "+c);
	}
}

public class UseMethodOverloading {
	public static void main(String[] args) {		
		ArithmeticCalc a1 = new ArithmeticCalc();
		a1.add();
		a1.add(25, 63);
		int x = a1.add(25, 63);
		System.out.println("5 times of x is: " +x*5);
		a1.add("Hi Hello ", "How are you today");
		//a1.ad
	}

}
