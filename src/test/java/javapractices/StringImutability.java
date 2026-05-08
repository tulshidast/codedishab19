package javapractices;

public class StringImutability {

	public static void main(String[] args) {

		String s = "Sachin";
		System.out.println(s);

		String ss = s.concat(" Tendulkar");

		System.out.println(s);

		System.out.println(ss);
		
		String s1 = "Sachin";
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
	}

}
