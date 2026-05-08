package javapractices;

import java.util.ArrayList;
import java.util.List;

public class ListCharacterestics {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("Java");
		list.add(100);
		list.add(100.00);
		list.add(true);

		for (Object obj : list) {
			System.out.println(obj);

			if (obj instanceof String) {
				System.out.println("String");
			} else if (obj instanceof Integer) {
				System.out.println("Integer");
			} else if (obj instanceof Double) {
				System.out.println("Double");
			} else if (obj instanceof Boolean) {
				System.out.println("Boolean");
			}
		}

		System.out.println("#####################################");

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(30);
		list2.add(3);
		list2.add(5);
		list2.add(300);

		// list2.add("Java"); // compile time error because of type safety

		for (Integer i : list2) {
			System.out.println(i);
		}

	}

}
