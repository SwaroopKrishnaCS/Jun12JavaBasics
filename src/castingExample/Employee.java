package castingExample;

public class Employee {

	int id;
	String name;
	double wage;

	public Employee(int id, String name,double wage) {
		this.id = id;
		this.name = name;
		this.wage=wage;
	}

	
	public String printNameId() {

		return name + " " +id + " " + wage;
	}

}
