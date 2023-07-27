package javaPrograms;

public class ForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		//System.out.println("After the end of loop, i value is: "+i);

		/*
		int i=1;
		for(;i<=10;) {
			System.out.println(i);
			i++;
		}
		System.out.println("After the end of loop, i value is: "+i);
		*/
		
		for(int i=10;i>=1;i--) {
			System.out.print(i + " ");
		}
		
	}

//	public static void printValues() {
//		System.out.println(i);
//	}
}
