package interfaceExample;

public class Fish implements Prey, Predator {

	@Override
	public void flee() {
		System.out.println("Flee......");

	}

	@Override
	public void attack() {
		System.out.println("Attack......");

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	// Run
	// Attack
}
