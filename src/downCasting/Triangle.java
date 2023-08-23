package downCasting;

public class Triangle implements Shape {

	int length;
	int breadth;

	public Triangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5 * length * breadth;
	}

	public void printInfo() {
		System.out.println("The dimension of triangle is " + length + ", " + breadth);
	}
}
