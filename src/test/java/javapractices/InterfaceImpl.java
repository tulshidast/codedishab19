package javapractices;

public class InterfaceImpl implements MyInterface,My2 {

	@Override
	public void method1() {
		System.out.println("This is method 1");
	}

	@Override
	public int method2(int a, int b) {
		return a + b;
	}

	@Override
	public void method3() {
		System.out.println("This is method 3");
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}

}
