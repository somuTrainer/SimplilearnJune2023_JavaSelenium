package javaPrograms;

public class WhileLoop {

	public static void main(String[] args) {		
		int i = 1;//initialization
		while(i<=10) {
			System.out.println(i);
			i++;//i = i + 1;
			//i=i+2;
		}
		System.out.println("After the end of loop, i value is: "+i);
		
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		System.out.println("After the end of loop, i value is: "+i);
	}

}
