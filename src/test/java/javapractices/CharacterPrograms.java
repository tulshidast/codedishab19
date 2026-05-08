package javapractices;

public class CharacterPrograms {

	public static void main(String[] args) {

		String str1 = "Hi all\n" + "How are You\n" + "welcome to coDedisha";
		System.out.println(str1);

		String str = "Hello World";

		int lowerCaseCount = 0;
		int upperCaseCount = 0;

		for (int i = 0; i < str.length(); i++) {

			if (Character.isLowerCase(str.charAt(i))) {
				lowerCaseCount++;
			} else if (Character.isUpperCase(str.charAt(i))) {
				upperCaseCount++;
			}
		}

		System.out.println("Lower case count: " + lowerCaseCount);
		System.out.println("Upper case count: " + upperCaseCount);

	}

}
