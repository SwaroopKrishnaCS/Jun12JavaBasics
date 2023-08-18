package abstractionWorkingExample;

public class RoyaltyShare extends RevnueCalculate {

	private static double PERCENTAGE=0.145;
	
	@Override
	public double calculate(ClientEngagement engagement) {
		// TODO Auto-generated method stub
		return PERCENTAGE*engagement.getAnticipatedRevnue();
	}

}
