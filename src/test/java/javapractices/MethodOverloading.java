package javapractices;

public class MethodOverloading {

	public static void main(String[] args) {

		M2 m = new M2();
		m.add();
		m.add(100, 200);
		m.add(100, 200, 300);
	}

	public void add() {
		System.out.println(10 + 20);
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

}

class M2 extends MethodOverloading {

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

}
