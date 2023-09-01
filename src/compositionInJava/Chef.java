package compositionInJava;

public class Chef {

	private String name;

	public Chef(String name) {
		this.name = name;
	}

	public void cook(Dish dish) {
		System.out.println(name + " is cooking " + dish.getNameOfDish());
	}

}
