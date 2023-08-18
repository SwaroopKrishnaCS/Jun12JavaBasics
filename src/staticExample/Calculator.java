package staticExample;

public class Calculator {

	public static double valueOfPi = 3.14;
	
	public double length=10;

	public static int calculate(String operation, int a, int b) {

		switch (operation) {
		case "sum":

			return a + b;

		case "sub":

			return a - b;

		default:
			return 0;
		}
	}

	public static void updatePiValue(double pi) {
		Calculator.valueOfPi = pi;
	}

	public static double areaOfCircle(int radius) {
		return valueOfPi * radius * radius;
	}
	
	
	
	public void printSomething() {
		areaOfCircle(15);
		System.out.println("I am non static");
		
	}
	
	public void printSomething(String input) {
	
		System.out.println("I am non static " +input);
		
	}

}
