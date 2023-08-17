package macdonald;

public class MacDonald {

	private String headQuaters;
	private int yearFound;
	private double revenue;
	private int noOfEmployees;

	public MacDonald(String headQuaters, int yearFound, double revenue, int noOfEmployees) {
		this.headQuaters = headQuaters;
		this.yearFound = yearFound;
		this.revenue = revenue;
		this.noOfEmployees = noOfEmployees;
	}

	public void conductTraining(String topic) {
		System.out.println("Training is conducted on : " + topic);
	}

	public double calculateAverageRevPerEmployee() {
		return revenue / noOfEmployees;
	}

	public void description() {
		System.out.println("The Macdonald headquater is situated at " + headQuaters + " in the year " + yearFound);
		System.out.println("The total no of employee is " + noOfEmployees);
		System.out.println("Total revnue : " + revenue);
	}

	public double calPriceOfMeal(double burgerPrice, double drinkPrice, double friesPrice) {
		double finalPrice = burgerPrice + drinkPrice + friesPrice;
		double taxVal=finalPrice*0.05;
		return finalPrice +taxVal;
	}
}
