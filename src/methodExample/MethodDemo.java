package methodExample;

public class MethodDemo {

	boolean isEligbleToVote(int age, boolean isCitizen) {

		if (age >= 18 && isCitizen) {
			return true;
		}

		return false;
	}

}
