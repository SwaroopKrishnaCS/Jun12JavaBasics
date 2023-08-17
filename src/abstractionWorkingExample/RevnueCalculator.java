package abstractionWorkingExample;

public class RevnueCalculator {

	static double HOURLY_RATE = 50;
	static double FIXED_RATE = 1500;
	static double ROYALTY_COMMISION = 0.15;

	static double calPrice(ClientEngagement engagement, String methodOfEng) {

		double total = 0;

		switch (methodOfEng) {
		case "Hourly":
			total = HOURLY_RATE * engagement.getHoursWorked();
			break;
		case "Fixed":
			total = FIXED_RATE;
			break;
		case "Royalty":
			total = ROYALTY_COMMISION * engagement.getAnticipatedRevnue();
			break;

		default:
			break;
		}
		return total;

	}
}
