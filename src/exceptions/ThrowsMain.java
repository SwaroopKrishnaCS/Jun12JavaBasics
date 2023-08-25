package exceptions;

public class ThrowsMain {

	public static void main(String[] args) {
		
		
		ThrowExample tExample = new ThrowExample();
		
		try {
			tExample.validatePin(1234);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			tExample.withdrawCash(1234, 5000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("After exception");
	}

}
