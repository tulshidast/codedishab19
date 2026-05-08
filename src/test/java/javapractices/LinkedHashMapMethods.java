package javapractices;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapMethods {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> studentInfo = new LinkedHashMap<>();

		// put method is used to add key-value pairs to the LinkedHashMap
		studentInfo.put(1, "John");
		studentInfo.put(2, "Jane");
		studentInfo.put(4, "Smith");
		studentInfo.put(5, "Emily");
		studentInfo.put(6, "Michael");
		studentInfo.put(3, "Doe");

		System.out.println("Student Info: " + studentInfo);
		System.out.println("######################################################################");

		LinkedHashMap<Integer, String> studentInfo2 = new LinkedHashMap<>();
		studentInfo2.put(7, "Alice");
		studentInfo2.put(8, "Bob");

		// putAll method is used to add all key-value pairs from one LinkedHashMap to
		// another
		studentInfo.putAll(studentInfo2);

		System.out.println("Student Info after putAll: " + studentInfo);

		System.out.println("######################################################################");

		// containsKey method is used to check if a specific key exists in the
		// LinkedHashMap
		// and returns a boolean value (true or false)
		System.out.println("Key 7 is in Student Info: " + studentInfo.containsKey(7));
		System.out.println("Key 9 is in Student Info: " + studentInfo.containsKey(9));

		System.out.println("Value Doe is in Student Info: " + studentInfo.containsValue("Doe"));
		System.out.println("Value sachin is in Student Info: " + studentInfo.containsValue("sachin"));

		System.out.println("######################################################################");

		// get method is used to retrieve the value associated with a specific key in
		// the LinkedHashMap
		System.out.println("Value belongs to key 7: " + studentInfo.get(7)); // returns "Alice"

		System.out.println("######################################################################");

		// isEmpty method is used to check if the LinkedHashMap is empty or not and
		// returns a
		// boolean value (true or false)
		System.out.println("is studentInfo empty : " + studentInfo.isEmpty()); // returns false because the
																				// LinkedHashMap is
																				// not empty

		System.out.println("######################################################################");

		// keySet method is used to retrieve a Set of all the keys present in the
		// LinkedHashMap
		Set<Integer> keys = studentInfo.keySet();

		for (Integer key : keys) {
			System.out.println("Key: " + key);
		}

		System.out.println("######################################################################");
		// remove method is used to remove a key-value pair from the LinkedHashMap based
		// on
		studentInfo.remove(5); // removes the key-value pair with key 5 (Emily)
		studentInfo.remove(3, "Doe"); // removes the key-value pair with key 3 and value "Doe"

		System.out.println("Student Info after remove: " + studentInfo);

		System.out.println("######################################################################");

		// replace method is used to replace the value associated with a specific key in
		studentInfo.replace(1, "Sachin");
		studentInfo.replace(2, "Jane", "Rohit"); // replaces the value associated with key 2 from "Jane" to "Rohit"

		System.out.println("Student Info after replace: " + studentInfo);
		System.out.println("######################################################################");

		// size method is used to get the number of key-value pairs present in the
		// LinkedHashMap
		System.out.println("Size of studentInfo: " + studentInfo.size());

		System.out.println("######################################################################");

		// values method is used to retrieve a Collection of all the values present in
		// the LinkedHashMap
		Collection<String> values = studentInfo.values();
		for (String value : values) {
			System.out.println("Value: " + value);
		}

		System.out.println("######################################################################");

		// entrySet method is used to retrieve a Set of all the key-value pairs present
		// in the LinkedHashMap as Map.Entry objects
		Set<Entry<Integer, String>> entSet = studentInfo.entrySet();

		for (Entry<Integer, String> std : entSet) {
			System.out.println(std.getKey() + " : " + std.getValue());
		}

		System.out.println("######################################################################");

		Iterator<Entry<Integer, String>> it = entSet.iterator();

		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("######################################################################");
		studentInfo.clear(); // clear method is used to remove all key-value pairs from the LinkedHashMap,
								// making
								// it empty

		System.out.println("Student Info after clear: " + studentInfo);

	}

}
