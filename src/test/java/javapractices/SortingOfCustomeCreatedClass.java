package javapractices;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingOfCustomeCreatedClass {

	public static void main(String[] args) {

		Student1 s1 = new Student1("John", 25);
		Student1 s2 = new Student1("Alice", 22);
		Student1 s3 = new Student1("Bob", 28);
		Student1 s4 = new Student1("David", 24);

		ArrayList<Student1> students = new ArrayList<>();

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		// sort the students by age in ascending order
		students.sort((s111, s222) -> s111.getAge() - s222.getAge());

		System.out.println("Sorting by age in ascending order");

		students.forEach(s -> System.out.println(s.getName() + " - " + s.getAge()));

		students.sort((s111, s222) -> s222.getAge() - s111.getAge());

		System.out.println("Sorting by age in descending order");

		students.forEach(s -> System.out.println(s.getName() + " - " + s.getAge()));

		students.sort((s111, s222) -> s111.getName().compareTo(s222.getName()));

		System.out.println("Sorting by name in ascending order");

		students.forEach(s -> System.out.println(s.getName() + " - " + s.getAge()));

		Comparator c = new Comparator<Student1>() {

			@Override
			public int compare(Student1 s111, Student1 s222) {
				return s111.getName().compareTo(s222.getName());
			}

		};

	}

}
