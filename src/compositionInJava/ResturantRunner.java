package compositionInJava;

import java.util.ArrayList;
import java.util.List;

public class ResturantRunner {

	public static void main(String[] args) {

		// Getting all the ingredients
		Ingredients tomato = new Ingredients("Tomato");
		Ingredients cheese = new Ingredients("Cheese");
		Ingredients dough = new Ingredients("Dough");
		Ingredients toppings = new Ingredients("Bell Pepper");
		Ingredients papproni = new Ingredients("Papproni");

		// Dish
		Dish cheesePizza = new Dish("Cheese Pizza");
		cheesePizza.addIngredients(toppings);
		cheesePizza.addIngredients(dough);
		cheesePizza.addIngredients(tomato);
		cheesePizza.addIngredients(cheese);

		Dish PepproniPizza = new Dish("Pepproni Pizza");
		cheesePizza.addIngredients(papproni);
		cheesePizza.addIngredients(dough);
		cheesePizza.addIngredients(tomato);
		cheesePizza.addIngredients(cheese);

		// Chef Created
		Chef munna = new Chef("Munna thakur");
		Chef rob = new Chef("Rob");

		Resturant resturant = new Resturant("Purani Tandoori haveli");
		resturant.addDishToMenu(PepproniPizza);
		resturant.addDishToMenu(cheesePizza);
		resturant.hireChef(rob);
		resturant.hireChef(munna);

		resturant.displayMenu();
		
		
		

		munna.cook(PepproniPizza);

		Order order = new Order(PepproniPizza, 5);

		order.serve();
	}

}
