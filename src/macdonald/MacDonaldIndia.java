package macdonald;

public class MacDonaldIndia extends MacDonald {

	double taxRate;

	public MacDonaldIndia(String headQuaters, int yearFound, double revenue, int noOfEmployees, int taxRate) {
		super(headQuaters, yearFound, revenue, noOfEmployees);
		this.taxRate = taxRate;
	}

	@Override
	public double calPriceOfMeal(double burgerPrice, double drinkPrice, double friesPrice) {
		double finalPrice = burgerPrice + drinkPrice + friesPrice;
		double taxVal = finalPrice * (taxRate/100);
		return finalPrice + taxVal;
	}

	public void specialOffer() {
		System.out.println("Welcome to MacDonald India");
		System.out.println("Enjoy a Free Pasta with all meals");

	}

	@Override
	public void description() {
		System.out.println("This is MacDonald India");
	}

}
