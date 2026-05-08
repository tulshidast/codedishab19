package javapractices;

public class Dog {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.color = "white";
		d.weight = 10.5f;
		d.height = 0.5f;

		System.out.println("Color: " + d.color);
		System.out.println("Weight: " + d.weight);
		System.out.println("Height: " + d.height);

		d.bark();
		d.run();

		System.out.println("Bread: " + Dog.bread);
		Dog.eat();
	}

//	public Dog() {
//	}

	static String bread = "german shepherd";

	public static void eat() {
		System.out.println(" German shepherd Dog is eating");
	}

	// object properties as instance member variables
	String color;// null
	float weight;// 0.0
	float height;// 0

	// object behavior as instance member function/method
	public void bark() {
		System.out.println("Dog is barking");
	}

	public void run() {
		System.out.println("Dog is runnig");
	}
}