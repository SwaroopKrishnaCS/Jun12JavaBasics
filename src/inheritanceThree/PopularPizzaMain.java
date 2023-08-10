package inheritanceThree;

import java.util.Scanner;

public class PopularPizzaMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PopularPizza pizza;

		System.out.println("Enter the location for Order");
		String location = sc.next();

		switch (location) {
		case "Brampton":
			pizza = new PopularPizzaBrampton();
			pizza.makePizzaBase();
			pizza.makePizzaSauce();
			pizza.prepareToppings();
			pizza.assembleAndCook();
			break;

		case "Toronto":

			pizza = new PopularPizzaToronto();
			pizza.makePizzaBase();
			pizza.makePizzaSauce();
			pizza.prepareToppings();
			pizza.assembleAndCook();
			
			break;
		case "Scar":

			pizza = new PopularPizzaScarbrorough();
			pizza.makePizzaBase();
			pizza.makePizzaSauce();
			pizza.prepareToppings();
			pizza.assembleAndCook();
			break;

		default:
			break;
		}

	}

}
