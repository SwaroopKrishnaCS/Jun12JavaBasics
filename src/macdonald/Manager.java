package macdonald;

public class Manager extends Employee {

	private String department;

	public Manager(int id, String name, String department) {
		super(id, name);
		this.department = department;

	}

	public void executeManagerTasks() {
		System.out.println("Schedule Shits");
		System.out.println("Do planning");
		System.out.println("Assigned Resp");
	}

}
