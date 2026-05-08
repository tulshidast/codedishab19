package javapractices;

public class ArrayPrograms {

	public static void main(String[] args) {

		int a[] = { 90, 8, 10, 35, 20, 30, 40, 50, 45 };
		// 8,10,20,30,35,40,45,50,90
		// 90,50,45,40,35,30,20,10,8
		// 8
		// 90
		// 10
		// 50

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		System.out.println("Largest element in array = " + a[a.length - 1]);
		System.out.println("Smallest element in array = " + a[0]);

		System.out.println("2nd Largest element in array = " + a[a.length - 2]);
		System.out.println("2nd Smallest element in array = " + a[1]);

		System.out.println();
		System.out.println("##############################################################");

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		System.out.println("Largest element in array = " + a[0]);
		System.out.println("Smallest element in array = " + a[a.length - 1]);

		System.out.println("2nd Largest element in array = " + a[1]);
		System.out.println("2nd Smallest element in array = " + a[a.length - 2]);

		System.out.println("##############################################################");
		System.out.println();
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("##############################################################");
		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int c[] : b) {
			for (int d : c) {
				System.out.print(d + " ");
			}
			System.out.println();
		}

	}

}
