package javapractices;

public class StringMethods {

	public static void main(String[] args) {

		String s = "Welcome to codedisha";

		// the char value at the specified index of this string.
		char c = s.charAt(4);
		System.out.println(c);

		// Compares two strings lexicographically. The comparison is based on the
		// Unicode
		// value of each character in the strings
		String s1 = "Welcome to pune";
		String s3 = "Welcome to pune";
		System.out.println(s.compareTo(s1));
		System.out.println(s3.compareTo(s1));

		// Concatenates the specified string to the end of this string.
		System.out.println(s.concat(" pune"));

		// Returns true if and only if this string contains the specified sequence of
		System.out.println(s.contains(" codedisha"));
		System.out.println(s.contains("dishtv"));

		// Returns true if this string ends with the specified suffix.
		System.out.println("S ends with to codedisha= " + s.endsWith("to codedisha"));
		System.out.println("S ends with to = " + s.endsWith("to "));

		System.out.println("s equals to s1= " + s.equals(s1));

		System.out.println("s3 equals to s1= " + s3.equals(s1));

		String s4 = "WELCOME TO CODEDISHA";

		System.out.println("s3 equals to s4= " + s.equals(s4));
		System.out.println("s3 equals ignore case to s4= " + s.equalsIgnoreCase(s4));

		// Returns the index within this string of the first occurrence of the specified
		// character
		System.out.println(s.indexOf('o'));

		// Welcome to codedisha
		System.out.println(s.indexOf("co"));

		System.out.println(s.indexOf('c', 5));

		System.out.println(s.indexOf("co", 5));

		// String s5 = " ";
		// String s6 = "";

		System.out.println("".isBlank());
		System.out.println("  ".isBlank());

		System.out.println("".isEmpty());
		System.out.println("  ".isEmpty());

		System.out.println(s.lastIndexOf('e'));

		System.out.println(s.length());

		String s7 = "  Welcome    to  codedisha  ";
		System.out.println(s7.trim());

		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		char a[] = s.toCharArray();

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		System.out.println(s.substring(8));
		System.out.println(s.substring(8, 10));

		String arr[] = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("#############################################");
		int i = 10;
		String s6 = String.valueOf(i);
		System.out.println(s6.length());

		// Welcome to codedisha
		System.out.println(s.replace('o', 'O'));

		System.out.println(s.replace("co", "CO"));

		String s8 = "WelCome 2324324 #$ codedisha #% ffgr345";

		System.out.println(s8.replaceAll("[^a-zA-Z ]", ""));
		System.out.println(s8.replaceAll("[a-zA-Z]", ""));
		System.out.println(s8.replaceAll("[^0-9a-zA-Z ]", ""));
		System.out.println(s8.replaceAll("[#$%]", ""));

	}

}
