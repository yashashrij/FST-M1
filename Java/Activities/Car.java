package activities;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car(){
		tyres = 4;
		doors = 4;
		}
	
	public void displayCharactristics() {
		System.out.println("Color of the Car: " + color);
		System.out.println("Make of the Car: " + make);
		System.out.println("Transmission of the Car: " + transmission);
		System.out.println("Number of doors: " + doors);
	    System.out.println("Number of tyres: " + tyres);
	}
	
	public void accelerate() {
		System.out.println("Car is moving forward.");
	}
	
	public void brake() {
		System.out.println("Car is not moving.");
	}

}
