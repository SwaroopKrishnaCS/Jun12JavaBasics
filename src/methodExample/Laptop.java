package methodExample;

public class Laptop {

	String BrandName;
	double price;

	public Laptop(String bName, double laptopPrice) {
		BrandName = bName;
		price = laptopPrice;
	}

	public double getTotalPrice() {
		double totalPrice =price+ calculateHST(price) + calculateCess(price);
		return totalPrice;
	}

	public double calculateHST(double price) {
		double tax = price * 0.13;
		return tax;	
		
	}

	public double calculateCess(double price) {
		double cess = price * 0.02;
		return cess;
	}

}
