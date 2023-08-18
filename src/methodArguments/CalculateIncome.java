package methodArguments;

public class CalculateIncome {

	public void calculateIncome(String payType, Person person) {

		switch (payType) {
		case "Hourly":
			System.out.println(person.name + " of age " + person.age + " has Hourly pay of $50");
			break;
		case "Fixed":
			System.out.println(person.name + " of age " + person.age + " has fixed pay of $50,000");
			break;

		default:
			break;
		}

	}

}
