package abstractionWorkingExample;

public class RevnueCalculatorRunner {

	public static void main(String[] args) {

		ClientEngagement engagement = new ClientEngagement("MacD", 12, 10000);
		RevnueCalculate cal = null;
		cal = new HourlyEngagement();

		double hourlyPrice = cal.calculate(engagement);
		System.out.println("The Hourly price is " + hourlyPrice);

		cal = new FixedFeeCal();
		double fixedPriceVal = cal.calculate(engagement);
		System.out.println(" The fixed fee is " + fixedPriceVal);

		cal = new RoyaltyShare();
		double val = cal.calculate(engagement);
		System.out.println("Royalty val " + val);


	}

}
