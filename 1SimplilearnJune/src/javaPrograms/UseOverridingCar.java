package javaPrograms;

class Car{
	
	public void start() {
		System.out.println("Start method - Car class");
	}
	
	public void changeGears() {
		System.out.println("changeGears method - Car class");
	}
	
	public void accelerate() {
		System.out.println("accelerate method - Car class");
	}
	
	public void stop() {
		System.out.println("stop method - Car class");
	}
	
	public void fuelType() {
		System.out.println("Petrol / Diesel");
	}
}

class Maruthi extends Car{
	
}

class MaruthiAutomatic extends Car{
	public void changeGears() {
		System.out.println("Automatic Gear System method - MaruthiAutomatic class");
	}
}

class MaruthiGasFuel extends Car{
	public void fuelType() {
		super.fuelType();
		System.out.println("CNG Fuel");
	}
}

public class UseOverridingCar {

	public static void main(String[] args) {
		Maruthi m = new Maruthi();		
		m.start();
		m.changeGears();
		m.accelerate();
		m.stop();
		m.fuelType();
		 
		MaruthiAutomatic m1 = new MaruthiAutomatic();
		m1.start();
		m1.changeGears();
		m1.accelerate();
		m1.stop();
		m1.fuelType();
		
		MaruthiGasFuel m2 = new MaruthiGasFuel();
		m2.start();
		m2.changeGears();
		m2.accelerate();
		m2.stop();
		m2.fuelType();
	}

}
