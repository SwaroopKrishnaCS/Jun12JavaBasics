package compositionInJava;

import java.util.ArrayList;
import java.util.List;

public class Resturant {

	private String name;
	private List<Dish> menu = new ArrayList<>();
	private List<Chef> chefs = new ArrayList<>();

	public Resturant(String name) {
		super();
		this.name = name;
	}

	public void addDishToMenu(Dish dish) {
		menu.add(dish);
	}

	public void hireChef(Chef chef) {
		chefs.add(chef);
	}

	public void displayMenu() {
		System.out.println("Resturant " + name + "  menu is : ");

		for (Dish dish : menu) {
			System.out.println(dish.getNameOfDish());
		}
	}

}
