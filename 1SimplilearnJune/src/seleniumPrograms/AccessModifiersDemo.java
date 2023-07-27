package seleniumPrograms;

import javaPrograms.AccessModifiers;

public class AccessModifiersDemo extends AccessModifiers{
	
	public static void main(String[] args) {
		AccessModifiers a1 = new AccessModifiers();
		a1.publicVar = 30;
		a1.publicMethod();
		a1.usePrivateVarMethod();	
		
		AccessModifiersDemo ad1 = new AccessModifiersDemo();
		ad1.protectedVar = 30;
		ad1.protectedMethod();
	}

}
