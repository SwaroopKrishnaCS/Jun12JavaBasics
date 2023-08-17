package macdonald;

public class ShiftManager extends Manager {

	private String shift;

	public ShiftManager(int id, String name, String department, String shift) {
		super(id, name, department);
		this.shift = shift;
	}

	public void handleShiftMeeting() {
		System.out.println("Shift Manager is handling Shift meeting");
	}

}
