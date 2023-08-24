package abstractionWorkingExample;

public class HourlyEngagement extends RevnueCalculate {

	private static double HOURLY_PRICE=50;
	
	@Override
	public double calculate(ClientEngagement engagement) {
		
		return HOURLY_PRICE*engagement.getHoursWorked();
	}

}
