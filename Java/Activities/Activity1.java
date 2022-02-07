package activities;

public class Activity1 {

	public static void main(String[] args) {
		Car suzuki = new Car();
		suzuki.make = 2020;
		suzuki.color = "Grey";
		suzuki.transmission = "Manual";
		
		suzuki.displayCharactristics();
		suzuki.accelerate();
		suzuki.brake();

	}

}
