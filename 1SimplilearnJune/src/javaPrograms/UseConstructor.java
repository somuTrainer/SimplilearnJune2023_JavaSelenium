package javaPrograms;

class Employee1{
	//instance variables OR object variables
	String empID = "EMP001";
	String empName = "Sanjay Singhania";
	int empAge = 30;
	
	//default constructor - constructor without any parameter
	public Employee1() {
		System.out.println("From the constructor method - Employee1");
	}
	
	//parameterized constructor - constructor with parameters
	public Employee1(String empID, String empName, int empAge) {
		this.empID = empID;
		this.empName = empName;
		this.empAge = empAge;
		
		System.out.println("Employee Name is: "+this.empName);
		System.out.println("Employee ID is: "+this.empID);
		System.out.println("Employee Age is: "+this.empAge);

	}
	
	public void performTask1() {
		System.out.println("empID = "+empID + " empName = " +empName + " empAge = "+empAge);
		empID = "EMP005";
		empName = "Sanjay Malhotra";
		empAge = 29;
	}
	
	public void performTask2() {
		System.out.println("empID = "+empID + " empName = " +empName + " empAge = "+empAge);
	}
}

public class UseConstructor {
	public static void main(String[] args) {		
		Employee1 emp1 = new Employee1();
		
//		System.out.println("Employee Name is: "+emp1.empName);
//		System.out.println("Employee ID is: "+emp1.empID);
//		System.out.println("Employee Age is: "+emp1.empAge);
//		
//		emp1.performTask1();
//		emp1.performTask2();
		
		Employee1 emp2 = new Employee1("EMP010", "Vinod Kumar", 27);
	}

}