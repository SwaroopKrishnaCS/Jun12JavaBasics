package exceptions;

public class ThrowExample {

	int pin;

	public void validatePin(int enteredPIN) throws IllegalArgumentException, NullPointerException {
		if (String.valueOf(pin) == null) {
			throw new NullPointerException("PIN cannot be null");
		} else if (pin == enteredPIN) {
			System.out.println("Pin is correct");
		} else {
			throw new IllegalArgumentException("Incorrect PIN");
		}
	}
	
	public void withdrawCash(int amount, int enteredPin) throws Exception{
		validatePin(enteredPin);
	}

}
