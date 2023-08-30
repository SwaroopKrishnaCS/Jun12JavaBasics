package downCasting;

public class Rectangle implements Shape {

	int a, b;

	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return a * b;
	}
	
	public void printInfo() {
		System.out.println("The dimension of rectangle is " + a +", "+ b);
	}

}
