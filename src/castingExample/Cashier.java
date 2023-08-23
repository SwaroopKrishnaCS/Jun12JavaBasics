package castingExample;

public class Cashier extends Employee {

	boolean isTemp;

	public Cashier(int id, String name, double wagePerHour, boolean isTemp) {
		super(id, name, wagePerHour);
		this.isTemp = isTemp;
	}
}
