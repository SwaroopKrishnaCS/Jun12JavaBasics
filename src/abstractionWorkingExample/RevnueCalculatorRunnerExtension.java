package abstractionWorkingExample;

import java.util.Iterator;

public class RevnueCalculatorRunnerExtension {

	public static void main(String[] args) {
		ClientEngagement[] engagments = { new ClientEngagement("TD", 70, 20000), new ClientEngagement("RBC", 45, 15000),
				new ClientEngagement("BMO", 60, 18000) };

		System.out.println("Fixed Fee");
		printRevenue(engagments, new FixedFeeCal());
		System.out.println("Hourly Fee");
		
		printRevenue(engagments, new HourlyEngagement());

		System.out.println("Royalty Fee");
		printRevenue(engagments, new RoyaltyShare());
		
		
		System.out.println("Quaterly Fee");
		printRevenue(engagments, new QuaterlyPayment());
		
		
		
	}
	
	
	public static void printRevenue(ClientEngagement[] engagement,RevnueCalculate revnueCalculate) {
		double total=0;
		
		for (ClientEngagement clientEngagement : engagement) {
			
			total=total+ revnueCalculate.calculate(clientEngagement);
			
		}
		
		System.out.println(total);
		
	
	}

}
