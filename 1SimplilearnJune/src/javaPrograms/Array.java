package javaPrograms;

public class Array {

	public static void main(String[] args) {
		int a = 10;
		long b = 123456L;
		
		int[] empAges = new int[5];//dynamic array
		
		//System.out.println(a);
		//System.out.println(b);		
		
		empAges[0] = 35;
		empAges[1] = 28;
		empAges[2] = 20;
		empAges[3] = 37;
		empAges[4] = 42;
		
		System.out.println("The length of the array empAges is: "+empAges.length);
		int sum=0;
		for(int i=0;i<empAges.length;i++) {
			//System.out.println(empAges[i]);
			sum = sum+empAges[i];			
		}		
		
		System.out.println("The sum of all emp Ages is: "+sum);
		System.out.println("The avg. age of emps is: "+sum/5);
		
		int[] empAges1 = {35, 28, 20, 37, 42};//static array
		//System.out.println(empAges1[3]);		
	}

}
