package javapractices;

public class UseOfFinalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee(1001, "John", 50000.0, 1234567890);
		emp.display();

	}

}

class Employee {
	int empId;
	String empName;
	double empSalary;
	final int adharNumber;

	public Employee(int empId, String empName, double empSalary, int aNumber) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.adharNumber = aNumber;
	}

	public void display() {
		empId = 1002; // we can change the value of empId because it's not final variable
		adharNumber = 1234567890; // compile time error because adharNumber is final
		// variable and we can't change the value of final variable
		System.out.println("Employee Id = " + empId);
		System.out.println("Employee Name = " + empName);
		System.out.println("Employee Salary = " + empSalary);
	}

}
