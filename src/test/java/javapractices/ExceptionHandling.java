package javapractices;

public class ExceptionHandling {

	public static void main(String[] args) {

		ExceptionHandling exceptionHandling = new ExceptionHandling();
		exceptionHandling.div(10, 2);
		exceptionHandling.div(10, 0);

		System.out.println("This is the end of the main method");

	}

	public void div(int a, int b) {
		int c = 0;
		try {
			c = a / b;
		} catch (NullPointerException e) {
			System.out.println("Exception is " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Exception is " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Exception is " + e.getMessage());
		} finally {
			System.out.println("This is the finally block");
		}

		System.out.println("The result is " + c);
	}

}
