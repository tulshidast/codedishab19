package javapractices;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<>();

		// Appends the specified element to the end of this list.
		l1.add(10);

		l1.add(20);

		System.out.println(l1); // [10, 20]

		// Inserts the specified element at the specified position in this list.
		l1.add(1, 15);

		System.out.println(l1); // [10, 15, 20]

		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(25);
		l2.add(30);

		// Appends all of the elements in the specified collection to the end of this
		// list, in the order that they are returned by the specified collection's
		// iterator.
		l1.addAll(l2);
		System.out.println(l1); // [10, 15, 20, 25, 30]

		// Returns true if this list contains the specified element.
		System.out.println("10 is inside l1 = " + l1.contains(10)); // true
		System.out.println("40 is inside l1 = " + l1.contains(40)); // false

		// Returns true if this list contains all of the elements of the specified
		System.out.println("L1 contains L2 = " + l1.containsAll(l2));
		System.out.println("L2 contains L1 = " + l2.containsAll(l1));

		// Returns true if this list contains no elements.
		System.out.println("L1 equals to L2 = " + l1.equals(l2));

		// Returns the element at the specified position in this list.
		System.out.println("Element from index 3 = " + l1.get(3)); // 25

		// Replaces the element at the specified position in this list with the
		// specified element.
		l1.set(4, 35);

		System.out.println(l1); // [10, 15, 20, 25, 35]

		// Returns true if this list contains no elements.
		System.out.println("L1 is empty = " + l1.isEmpty()); // false

		// Returns the index of the first occurrence of the specified element in this
		System.out.println("Index of 35 = " + l1.indexOf(35)); // 4

		// Removes the element at the specified position in this list. Shifts any
		l1.remove(0);

		System.out.println(l1); // [15, 20, 25, 35]

		// Removes the first occurrence of the specified element from this list, if it
		l1.remove(Integer.valueOf(25));

		System.out.println(l1); // [15, 20, 35]

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

		// Returns a view of the portion of this list between the specified fromIndex,
		// inclusive, and toIndex, exclusive. (If fromIndex and toIndex are equal, the
		// returned list is empty.)
		System.out.println("Sublist from index 2-4 = " + l1.subList(2, 4));

		ArrayList<Integer> l3 = new ArrayList<>();
		l3.add(3000);
		l3.add(4000);

		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));

		}

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
