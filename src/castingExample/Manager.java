package castingExample;

public class Manager extends Employee {

	String shift;
	String dept;

	public Manager(int id, String name, String shift, String dept,double wagePerHour) {
		super(id, name,wagePerHour);
		this.shift = shift;
		this.dept = dept;

	}

	public void allotTime() {
		System.out.println("Manager name : " + " with dept " + dept + " has employee id " + id);
	}

}
