package downCasting;

public class DownCastingExample {

	public static void main(String[] args) {

		Shape shape = new Circle(10);
		calArea(shape);
		shape = new Rectangle(5, 10);
		calArea(shape);
		shape = new Triangle(10, 5);
		calArea(shape);

	}

	public static void calArea(Shape shape) {

		double area = shape.calculateArea();

		System.out.println("Area is :" + area);

		if (shape instanceof Circle) {
			Circle circle = (Circle) shape;
			circle.printInfo();
		} else if (shape instanceof Triangle) {
			Triangle triangle = (Triangle) shape;
			triangle.printInfo();
		} else {
			Rectangle rectangle = (Rectangle) shape;
			rectangle.printInfo();
		}

	}

}
