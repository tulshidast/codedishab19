package javapractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilityClass {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(40);
		list.add(50);
		list.add(80);
		list.add(20);
		list.add(30);
		list.add(90);
		list.add(60);
		list.add(70);
		list.add(100);
		list.add(10);

		System.out.println(list);

		// sort the list in ascending order
		Collections.sort(list);

		System.out.println(list);

		// sort the list in descending order
		// Collections.sort(list, Collections.reverseOrder());
		Collections.reverse(list);

		System.out.println(list);

		System.out.println("Max: " + Collections.max(list));

		System.out.println("Min: " + Collections.min(list));

		List<Integer> num = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

		num.forEach(n -> System.out.print(n + " "));

	}

}
