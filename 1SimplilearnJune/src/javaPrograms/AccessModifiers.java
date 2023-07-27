package javaPrograms;

public class AccessModifiers{
	int defaultVar;
	public int publicVar;
	protected int protectedVar;	
	private int privateVar;
	
	void defaultMethod() {
		System.out.println("defaultMethod - class AccessModifiers");
	}
	
	public void publicMethod() {
		System.out.println("publicMethod - class AccessModifiers");
	}
	
	protected void protectedMethod() {
		System.out.println("protectedMethod - class AccessModifiers");
	}
	
	private void privateMethod() {
		System.out.println("privateMethod - class AccessModifiers");
	}
	
	public void usePrivateVarMethod() {
		privateVar = 50;
		privateMethod();
	}
}
