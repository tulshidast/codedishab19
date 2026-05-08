package javapractices;

public class UseOfInterface {

	public static void main(String[] args) {

		MyInterface myInterface = new InterfaceImpl();
		myInterface.method1();
		int sum = myInterface.method2(10, 20);
		System.out.println("Sum = " + sum);
		myInterface.method3();
		System.out.println(My2.a);

	}

}
