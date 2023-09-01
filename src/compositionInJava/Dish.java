package compositionInJava;

import java.util.ArrayList;
import java.util.List;

public class Dish {

	private String nameOfDish;

	private List<Ingredients> ingredients=new ArrayList<>();

	public Dish(String nameOfDish) {
		this.nameOfDish = nameOfDish;
	}

	public String getNameOfDish() {
		return nameOfDish;
	}
	
	public void addIngredients(Ingredients ingredient) {
		ingredients.add(ingredient);
	}

}
