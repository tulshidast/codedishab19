package javapractices;

import java.util.LinkedHashMap;

public class HashMapImpl {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> adharDetails = new LinkedHashMap<Integer, String>();
		adharDetails.put(12234554, "Rohit");
		adharDetails.put(12234555, "Suresh");
		adharDetails.put(12234556, "Rohit");
		adharDetails.put(12234557, null);
		adharDetails.put(null, "Dinesh");
		adharDetails.put(12234554, "Naresh");
		adharDetails.put(23453434, null);
		
		System.out.println(adharDetails);

	}

}
