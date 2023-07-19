package methodExample;

public class MethodParameters {

	// Method which accepts paramters and return a value
	int sumOfTwoNumbers(int a, int b) {
		return a + b;
	}

	String getLastName(String firstName) {

		switch (firstName) {
		case "Munni":
			return "Badnaam";
		case "Sheela":
			return "Jawan";

		}
		return null;

	}

	boolean isBrandAvailable(String brandName) {

		switch (brandName) {
		case "Toyota":

			return true;
		case "Honda":

			return true;
		case "Nissan":

			return true;
		case "Tesla":

			return true;

		}

		return false;

	}

}
