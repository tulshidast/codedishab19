package javapractices;

public class UseOfFinalWithClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

final class ParentClass {
	public void display() {
		System.out.println("This is display method of ParentClass");
	}
}

// compile time error because we can't inherit final class
class ChildClass extends ParentClass {
	public void display() {
		System.out.println("This is display method of ChildClass");
	}
}
