package javapractices;

public class InheritanceExp {

	public static void main(String[] args) {

		FourWheelerVehicle car = new FourWheelerVehicle();
		car.model = "BMW";
		car.manufactures = "Germany";
		car.topSpeed = 250.0f;
		car.noOfDoors = 4;

		System.out.println("Model: " + car.model);
		System.out.println("Manufactures: " + car.manufactures);
		System.out.println("Top Speed: " + car.topSpeed);
		System.out.println("Number of Doors: " + car.noOfDoors);

		car.run();
		car.openDoor();

	}
}

class Vehicle {

	// properties
	String model;
	String manufactures;
	float topSpeed;

	// Behavior
	public void run() {
		System.out.println("Vehicle is running");
	}

	public void stop() {
		System.out.println("Vehicle is stopped");
	}

}

class FourWheelerVehicle extends Vehicle {

	// properties
	int noOfDoors;

	// Behavior
	public void openDoor() {
		System.out.println("Door is opened");
	}

	public void closeDoor() {
		System.out.println("Door is closed");
	}
}

class TwoWheelerVehicle extends Vehicle {

	// properties
	boolean hasCarrier;

	// Behavior
	public void openCarrier() {
		System.out.println("Carrier is opened");
	}

	public void closeCarrier() {
		System.out.println("Carrier is closed");
	}
}

class Bycle extends TwoWheelerVehicle {

	// properties
	String type;

	// Behavior
	public void ringBell() {
		System.out.println("Bell is ringing");
	}

}
