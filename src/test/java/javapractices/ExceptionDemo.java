package javapractices;

public class ExceptionDemo {

	public static void main(String[] args) {

		ExceptionDemo exceptionDemo = new ExceptionDemo();

		exceptionDemo.div(10, 2);

		// exceptionDemo.div(10, 0);

		exceptionDemo.nullPointer("Sachin");

		// exceptionDemo.nullPointer(null);

		exceptionDemo.numberFormat("100");

		// exceptionDemo.numberFormat("abc200");

		exceptionDemo.arrayIndexOutOfBound(2);

		// exceptionDemo.arrayIndexOutOfBound(5);

		exceptionDemo.stringIndexOutOfBound("Hello", 1);

		// exceptionDemo.stringIndexOutOfBound("Hello", 6);

		System.out.println("This is the end of the main method");

	}

	public void div(int a, int b) {
		int c = a / b;
		System.out.println("The result is " + c);

	}

	public void nullPointer(String str) {
		System.out.println("Lenght of string = " + str.length());
	}

	public void numberFormat(String str) {
		int num = Integer.parseInt(str);
		System.out.println("The number is " + (num + 10));
	}

	public void arrayIndexOutOfBound(int index) {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(arr[index]);
	}

	public void stringIndexOutOfBound(String str, int index) {
		System.out.println(str.charAt(index));
	}

}
