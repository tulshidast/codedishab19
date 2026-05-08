package javapractices;

public class ArrayInJava {
	
	int a = 10; // instance variable
	public static final int b = 20; // static variable

	public static void main(String[] args) {

		// array declarations
		int[] a;
		int[] b;
		int c[];
		int d[];

		// multi dimentional array
		int aaa[][];
		aaa = new int[3][5];
		aaa[0][0] = 2;
		aaa[0][1] = 3;
		aaa[0][2] = 4;
		aaa[0][3] = 5;
		aaa[0][4] = 50;

		aaa[1][0] = 2;
		aaa[1][1] = 3;
		aaa[1][2] = 4;
		aaa[1][3] = 5;
		aaa[1][4] = 50;

		aaa[2][0] = 2;
		aaa[2][1] = 3;
		aaa[2][2] = 4;
		aaa[2][3] = 5;
		aaa[2][4] = 50;

		// initialization
		a = new int[3];
		a[0] = 10;
		a[1] = 4;
		a[2] = 20;

		// array declaration and initialization
		String aa[] = new String[3];
		aa[0] = "Sachin";
		aa[1] = "Virat";
		aa[2] = "Hardik";

		// it will through index out of bounds exception
		// aa[3]="Rahul";

		// accessing of elements
		System.out.println("Accessing of element from array = " + aa[2]);

		int numbers[] = { 10, 20, 40, 39, 39 };

		System.out.println("Size of array or number of elements in array = " + numbers.length);

		// ArrayIndexOutOfBoundsException
		// System.out.println(numbers[5]);

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// multi dimensional array
		int marray[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		marray[1][2] = 8;

		int indexedElement = marray[1][2];

		System.out.println(indexedElement);

		// marray.length;
		// marray[2].length;

		System.out.println("################################################################");

		for (int i = 0; i < marray.length; i++) {
			for (int j = 0; j < marray[i].length; j++) {

				System.out.print(marray[i][j] + "  ");

			}
			System.out.println();
		}

		System.out.println("################################################################");

		for (int i = 0; i < marray.length; i++) {
			for (int j = 0; j < marray[i].length; j++) {

				if (i == j) {
					System.out.print(marray[i][j] + "  ");
				}

			}
			System.out.println();
		}

	}

}
