package abstractionWorkingExample;

public class RevnueCalculatorRunner {

	public static void main(String[] args) {

		ClientEngagement engagement = new ClientEngagement("MacD", 12, 10000);

		System.out.println("Calculate price based on hours worked");

		double value1 = RevnueCalculator.calPrice(engagement, "Hourly");
		System.out.println("Hourly Value is " +value1);
		
		double value2 = RevnueCalculator.calPrice(engagement, "Fixed");
		System.out.println("fixed Value is " +value2);
		
		double value3 = RevnueCalculator.calPrice(engagement, "Royalty");
		System.out.println("fixed Value is " +value3);
	}

}
