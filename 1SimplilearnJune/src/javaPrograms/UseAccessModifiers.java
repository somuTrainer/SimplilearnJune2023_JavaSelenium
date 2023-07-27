package javaPrograms;

public class UseAccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers a1 = new AccessModifiers();
		a1.defaultVar = 10;
		a1.publicVar = 20;
		a1.protectedVar = 30;
		//a1.privateVar = 40;		
		
		a1.defaultMethod();
		a1.publicMethod();
		a1.protectedMethod();
		//a1.privateMethod();
		a1.usePrivateVarMethod();
		
		PublicDemoClass p1 = new PublicDemoClass();
		p1.method1();
		p1.method2();
		
		DefaultDemoClass d1 = new DefaultDemoClass();
		d1.method1();
		d1.method2();
	}
}
