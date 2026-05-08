package javapractices;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {

	public static void main(String[] args) {

		HashSet<Integer> l1 = new HashSet<>();

		// Appends the specified element to the end of this list.
		l1.add(10);

		l1.add(20);
		l1.add(20); // duplicate value will not be added
		l1.add(null); // null value can be added

		System.out.println(l1); // [10, 20]

		HashSet<Integer> l2 = new HashSet<>();
		l2.add(25);
		l2.add(30);

		// Appends all of the elements in the specified collection to the end of this
		// list, in the order that they are returned by the specified collection's
		// iterator.
		l1.addAll(l2);
		System.out.println(l1); // [10, 20, 25, 30]

		// Returns true if this list contains the specified element.
		System.out.println("10 is inside l1 = " + l1.contains(10)); // true
		System.out.println("40 is inside l1 = " + l1.contains(40)); // false

		// Returns true if this list contains all of the elements of the specified
		System.out.println("L1 contains L2 = " + l1.containsAll(l2));
		System.out.println("L2 contains L1 = " + l2.containsAll(l1));

		// Returns true if this list contains no elements.
		System.out.println("L1 equals to L2 = " + l1.equals(l2));

		System.out.println(l1); // [10, 15, 20, 25, 30]

		// Returns true if this list contains no elements.
		System.out.println("L1 is empty = " + l1.isEmpty()); // false

		// Removes the element at the specified position in this list. Shifts any
		l1.remove(0);

		System.out.println(l1); // [15, 20, 25, 30]

		// Removes the first occurrence of the specified element from this list, if it
		l1.remove(Integer.valueOf(25));

		System.out.println(l1); // [15, 20, 30]

		// Returns the number of elements in this list.
		System.out.println("Size of L1 = " + l1.size()); // 3

		Object arr[] = l1.toArray();
		for (Object o : arr) {
			System.out.print(o + " ");
		}

		// Removes all of the elements from this list. The list will be empty after
		l1.clear();

		System.out.println("\nL1 after clear = " + l1); // L1 after clear = []

		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add(400);
		l1.add(500);

		HashSet<Integer> l3 = new HashSet<>();
		l3.add(3000);
		l3.add(4000);

		System.out.println("###############################################################################");

		for (Integer i : l1) {
			System.out.println(i);
		}

		System.out.println("###############################################################################");

		Iterator<Integer> it = l1.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
