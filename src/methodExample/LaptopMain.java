package methodExample;

import java.util.Scanner;

public class LaptopMain {

	public static void main(String[] args) {
		Laptop dell = new Laptop("Dell", 1000);
		Laptop hp = new Laptop("HP", 1500);

		Laptop[] laptops = { dell, hp };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which Laptop you want");

		String nameOfLaptop = sc.next();

		for (int i = 0; i < laptops.length; i++) {
			if (laptops[i].BrandName.equals(nameOfLaptop)) {
				System.out.println("The selling price of laptop is " + laptops[i].getTotalPrice());
				break;
			}

		}

	}

}
