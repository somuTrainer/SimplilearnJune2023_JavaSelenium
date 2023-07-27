package javaPrograms;

//abstract class
abstract class AbstractDemo{
	//concrete method
	public void method1() {
		System.out.println("method1 - AbstractDemo");
	}
	
	public void method2() {
		System.out.println("method2 - AbstractDemo");
	}
	
	//abstract method - method without body
	public abstract void method3Abstract();
	public abstract void method4Abstract();
}

//concrete class
class ChildOfAbstract extends AbstractDemo{
	public void method3Abstract() {
		System.out.println("method3Abstract - ChildOfAbstract");
	}
	
	public void method4Abstract() {
		System.out.println("method4Abstract - ChildOfAbstract");
	}
}

public class UseAbstractClass {
	public static void main(String[] args) {
		//AbstractDemo absdemo = new AbstractDemo(); //Unable to create object
		ChildOfAbstract childAbstract = new ChildOfAbstract();
		childAbstract.method1();
		childAbstract.method2();
	}

}
