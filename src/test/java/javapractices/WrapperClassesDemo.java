package javapractices;

public class WrapperClassesDemo {

	public static void main(String[] args) {

		Integer num = 10;
		Integer num2 = 20;

		System.out.println(num.reverse(40));

		Integer sum = num + num2;

		System.out.println("Sum: " + sum);

		int num3 = 40;

		// boxing its a process of converting primitive type to wrapper class type
		Integer n2 = Integer.valueOf(num3);
		System.out.println("n2: " + n2);

		// unboxing is a process of converting wrapper class type to primitive type
		int n3 = n2.intValue();

		// auto boxing is a process of converting wrapper class type to primitive type
		// without using any method
		Integer n4 = num3;

		n3 = n4; // auto unboxing

	}

}
