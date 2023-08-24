package methodArguments;

public class MethodArgMain {

	public static void main(String[] args) {
		CalculateIncome income=new CalculateIncome();
		
		Person person=new Person("Manvir", 35);
		
		income.calculateIncome("Hourly", person);

	}

}
