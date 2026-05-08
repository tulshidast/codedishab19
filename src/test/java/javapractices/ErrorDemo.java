package javapractices;

public class ErrorDemo {

	public static void main(String[] args) {
		ErrorDemo errorDemo = new ErrorDemo();
		errorDemo.method1();

	}

	public void method1() {
		System.out.println("This is method 1");
		method1();
	}

}
