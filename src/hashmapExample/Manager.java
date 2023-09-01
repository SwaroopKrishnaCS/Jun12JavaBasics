package hashmapExample;

public class Manager extends Employee {

	String shift;

	public Manager(int id, String name, String shift) {
		super(id, name);
		this.shift = shift;
	}

	public void allocateShiftSuprevisor() {
		System.out.println("Shift suprevisor allocated ");
	}

}
