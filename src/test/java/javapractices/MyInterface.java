package javapractices;

public interface MyInterface {

	int a = 10; // static and final by default
	public static final int b = 20; // static and final by default

	// An interface is a blueprint of a class. It has static constants and abstract
	// methods.
	public abstract void method1();

	/**
	 * This is method 2. It takes two integer parameters and returns an integer
	 * value.
	 * 
	 * @param a the first integer parameter
	 * @param b the second integer parameter
	 * @return the sum of a and b
	 * @throws IllegalArgumentException if a or b is negative
	 *
	 */
	public abstract int method2(int a, int b);

	void method3();

}

interface My2 extends MyInterface {

	void method4();
	
}