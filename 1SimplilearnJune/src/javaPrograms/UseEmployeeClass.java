package javaPrograms;

class Employee{
	String empID;
	String empName;
	int empAge;
	
	public void performTask1(String name) {
		System.out.println("performTask1 by : " +name);
	}
	
	public void performTask2(String name) {
		System.out.println("performTask2 by : " +name);
	}
}

public class UseEmployeeClass {
	public static void main(String[] args) {		
		//className objectName = new className();
		Employee emp1 = new Employee();
		emp1.empName = "Subhash Kumar";
		emp1.empID = "EMP001";
		emp1.empAge = 35;
		
		System.out.println("Employee Name is: "+emp1.empName);
		System.out.println("Employee ID is: "+emp1.empID);
		System.out.println("Employee Age is: "+emp1.empAge);
		
		emp1.performTask1(emp1.empName);
		emp1.performTask2(emp1.empName);
		
		System.out.println("*************************************");
		System.out.println();
		
		Employee emp2 = new Employee();
		emp2.empName = "Rajesh Khanna";
		emp2.empID = "EMP002";
		emp2.empAge = 38;
		
		System.out.println("Employee Name is: "+emp2.empName);
		System.out.println("Employee ID is: "+emp2.empID);
		System.out.println("Employee Age is: "+emp2.empAge);
		
		emp2.performTask1(emp1.empName);
		emp2.performTask2(emp1.empName);
	}

}
