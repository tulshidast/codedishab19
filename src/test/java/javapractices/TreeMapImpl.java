package javapractices;

import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {

		TreeMap<Integer, String> adharDetails = new TreeMap<Integer, String>();
		adharDetails.put(12234554, "Rohit");
		adharDetails.put(12234555, "Suresh");
		adharDetails.put(12234556, "Rohit");
		adharDetails.put(12234557, null);
		
		// TreeMap does not allow null key, it will throw NullPointerException
		// adharDetails.put(null, "Dinesh");
		adharDetails.put(12234554, "Naresh");
		adharDetails.put(23453434, null);
		
		System.out.println(adharDetails);

	}

}
