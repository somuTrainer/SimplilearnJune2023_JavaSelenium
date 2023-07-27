package javaPrograms;

interface PropertyAgreement{
	public void termsofPayment();
	public void propertyDetails();
	public void otherTerms();
}

class Buyer1 implements PropertyAgreement{
	public void termsofPayment() {
		System.out.println("50% cash 50% loan");
	}
	public void propertyDetails() {
		System.out.println("Flat 301, East Facing, 1050 sft");
	}
	public void otherTerms() {
		System.out.println("Payment to be done within 45 days");
	}
}

class Buyer2 implements PropertyAgreement{
	public void termsofPayment() {
		System.out.println("20% cash 80% loan");
	}
	public void propertyDetails() {
		System.out.println("Flat 302, West Facing, 1100 sft");
	}
	public void otherTerms() {
		System.out.println("Payment to be done within 15 days");
	}
}
public class UseInterface {

	public static void main(String[] args) {
		//Buyer1 buy1 = new Buyer1();
//		Buyer1 buy1;		
//		buy1 = new Buyer1();
//		buy1.propertyDetails();
//		buy1.termsofPayment();
//		buy1.otherTerms();
//		
//		Buyer2 buy2 = new Buyer2();
//		buy2.propertyDetails();
//		buy2.termsofPayment();
//		buy2.otherTerms();
		
		PropertyAgreement p1;
		
		p1= new Buyer1();
		p1.propertyDetails();
		p1.termsofPayment();
		p1.otherTerms();
		
		p1 = new Buyer2();
		p1.propertyDetails();
		p1.termsofPayment();
		p1.otherTerms();
	}

}
