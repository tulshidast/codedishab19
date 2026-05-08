package javapractices;

public class JavaBeanExmple {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		JavaBeanExmple javaBeanExmple = new JavaBeanExmple();
		javaBeanExmple.setName("Sachin");
		javaBeanExmple.setAge(50);

		System.out.println("Name = " + javaBeanExmple.getName());
		System.out.println("Age = " + javaBeanExmple.getAge());
	}

}
