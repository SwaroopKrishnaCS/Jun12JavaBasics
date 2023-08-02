package polymorphism;

public class PolyMain {

	public static void main(String[] args) {
		var poly=new Poly();
		
		var sumOf2Numbers=poly.addNumbers(5, 10);
		
		System.out.println(sumOf2Numbers);
		
		var sumOf3Numbers=poly.addNumbers(12, 15.0);
		System.out.println(sumOf3Numbers);

	}

}
