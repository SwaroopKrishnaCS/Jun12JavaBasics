package staticExample;

public class StaticMain {

	

	
	
	public static void main(String[] args) {

	
		/*
		 * Calculator firstCal=new Calculator();
		 * 
		 * 
		 * System.out.println(firstCal.calculate("sum", 10, 20));
		 * 
		 * Calculator secondCal=new Calculator();
		 * System.out.println(secondCal.calculate("sub", 20, 10));
		 */

		// firstCal.updatePiValue(3.143); secondCal.updatePiValue(3.145);

		System.out.println(Calculator.calculate("sum", 10, 10));

		System.out.println(Calculator.calculate("sub", 20, 10));

		System.out.println("Area of circle before : " + Calculator.areaOfCircle(5));

		Calculator.updatePiValue(3.143);

		System.out.println("Area of circle after: " + Calculator.areaOfCircle(5));

		/*
		 * System.out.println("Area of circle using object: " +
		 * firstCal.areaOfCircle(10));
		 * 
		 * firstCal.updatePiValue(3.143);
		 * 
		 * System.out.println("Area of circle using object: " +
		 * secondCal.areaOfCircle(10));
		 */

	}
}
