package javapractices;

public class UseOfThrow {

	public static void main(String[] args) throws MyException {
		
		UseOfThrow useOfThrow = new UseOfThrow();
		//useOfThrow.div(10, 2);
		useOfThrow.div(10, 0);

		System.out.println("This is the end of the main method");

	}
	
	public void div(int a, int b) throws MyException {
		
		if (b == 0) {
			throw new MyException("Please provide a non zero value");
		}
		
		int c = a / b;
		System.out.println("The result is " + c);
	}

}
