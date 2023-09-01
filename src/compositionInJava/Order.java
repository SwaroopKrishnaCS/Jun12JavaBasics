package compositionInJava;

public class Order {

	private Dish dish;
	private int tableNumber;

	public Order(Dish dish, int tableNumber) {
		this.dish = dish;
		this.tableNumber = tableNumber;
	}

	public void serve() {
		System.out.println(dish.getNameOfDish() + " is served on table " + tableNumber);
	}

}
