package compositionInJava;

import java.util.ArrayList;
import java.util.List;

final public class Resturant {

	private final int taxSlab= 10;
	private String name;
	private List<Dish> menu = new ArrayList<>();
	private List<Chef> chefs = new ArrayList<>();

	public Resturant(String name) {
		super();
		this.name = name;
	}

	public final void addDishToMenu(Dish dish) {
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
