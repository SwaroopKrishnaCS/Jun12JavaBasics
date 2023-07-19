package methodExample;

public class MethodBasic {

	// return type nameOfTheMethod(){

//}

	// Method which doesn't return anything
	void sumOfTwoNumbers() {
		int a = 5;
		int b = 7;
		int c = a + b;
		System.out.println("Sum =" + c);
	}

	// Method which return int value
	int diffOfTwoNumbers() {
		int a = 5;
		int b = 7;
		int c = b - a;
		return c;
	}

	// Method which return boolean value

	boolean isCarAvailable() {

		boolean isHondaCarAvailable = true;

		if (isHondaCarAvailable) {
			return true;
		}

		return false;

	}

	String getName() {

		return "Singh";
	}

}
