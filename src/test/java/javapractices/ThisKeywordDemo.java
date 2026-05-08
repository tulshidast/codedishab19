package javapractices;

public class ThisKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1(101, "John");
		s1.display();

		Student1 s2 = new Student1(101, "John");

		// this is not allowed in static context, because this refers to the current
		// object, and in
		// static context there is no current object.
		// System.out.println("Hash code of s1: " + this.hashCode());

		Student1 s3 = new Student1(102);
		System.out.println("Hash code of s3: " + s3.hashCode());

	}

}

class Student {

	int id;
	String name;

	// this keyword is used to refer to the current object. It is used to
	// differentiate between instance variables and local
	// variables when they have the same name.
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Student(int id) {
		this("Sachin"); // this() is used to call another constructor in the same class. It must be the
						// first statement in the constructor.
		System.out.println("Id: " + id);
	}

	Student(String name) {
		System.out.println("name: " + name);
	}

	void display() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Hash code of s1 using this: " + this.hashCode());
		// this can be used to call the current class method. It is optional to use this
		// keyword when calling the method,
		// but it is used here for demonstration purposes.
		this.test();
	}

	public void test() {
		System.out.println("This is a test method.");
	}

}
