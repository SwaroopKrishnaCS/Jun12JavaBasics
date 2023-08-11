package macdonald;

public class MacDonaldAustralia extends MacDonald {

	double taxRate;

	public MacDonaldAustralia(String headQuaters, int yearFound, double revenue, int noOfEmployees,int tax) {
		super(headQuaters, yearFound, revenue, noOfEmployees);
		this.taxRate=tax;

	}

	@Override
	public double calPriceOfMeal(double burgerPrice, double drinkPrice, double friesPrice) {
		double finalPrice = burgerPrice + drinkPrice + friesPrice;
		double taxVal = finalPrice * (taxRate/100);
		return finalPrice + taxVal;
	}

	public void specialOffer() {
		System.out.println("Welcome to MacDonald Australia");
		System.out.println("Enjoy a Free coke with All Happy meals");

	}
}
