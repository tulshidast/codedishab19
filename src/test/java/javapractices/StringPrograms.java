package javapractices;

public class StringPrograms {

	public static void main(String[] args) {

		String s = "Welcome to codedisha";

		// Reverse a string
		// ahsidedoc ot emocleW

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

		System.out.println();
		System.out.println("#############################################");

		// reverse a string words
		// emocleW ot codedisha

		String a[] = s.split(" ");

		for (int i = 0; i < a.length; i++) {

			for (int j = a[i].length() - 1; j >= 0; j--) {
				System.out.print(a[i].charAt(j));
			}
			System.out.print(" ");
		}

		System.out.println("#############################################");

		String s1 = "Welcome to codedisha$% 2344";
		System.out.println(s1.replaceAll("[a-zA-Z0-9 ]", ""));
		System.out.println(s1.replaceAll("[^a-zA-Z0-9 ]", ""));
		System.out.println(s1.replaceAll("[^0-9]", ""));
		System.out.println(s1.replaceAll("[^a-zA-Z ]", ""));

		System.out.println("#############################################");
		// W=1 e=3 l=1 c=2 o=3 m=1 t=1 d=2 i=1 s=1 h=1 a=1

		String s3 = "";

		for (int i = 0; i < s.length(); i++) {
			int count = 1;

			if (s3.contains(s.charAt(i) + "")) {
				continue;
			}

			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}

			System.out.println(s.charAt(i) + "=" + count);
			s3 = s3 + s.charAt(i);
		}

	}

}
