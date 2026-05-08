package javapractices;

public class MethodOverriding {

	public static void main(String[] args) {

		// M3 m = new M3();

		MethodOverriding m = new M3();
		m.test(10, 20);

		MethodOverriding m1 = new MethodOverriding();
		m1.test(10, 20);
	}

	public void test(int a, int b) {
		System.out.println(a + b);
	}

}

class M3 extends MethodOverriding {

	public void test(int a, int b) {
		System.out.println(a * b);
	}

}
