package downCasting;

public class Circle implements Shape {

	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
	public void printInfo() {
		System.out.println("The radius of circle is " + radius);
	}

}
