package exceptions;

public class HOD extends Person {

	String department;

	public HOD(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}

	public void handleDepartment() {
		System.out.println("Teacher teaching " + department);
	}

}
