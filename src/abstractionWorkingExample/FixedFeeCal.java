package abstractionWorkingExample;

public class FixedFeeCal extends RevnueCalculate {

	public static double FIXED_FEE=1000;
	
	@Override
	public double calculate(ClientEngagement engagement) {
		
		return FIXED_FEE;
	}

}
