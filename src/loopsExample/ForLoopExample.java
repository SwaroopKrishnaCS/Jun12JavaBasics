package loopsExample;

import java.util.Scanner;

public class ForLoopExample {

	int actualPin;
	int enteredPin;
	Scanner sc = new Scanner(System.in);
	boolean isPinValid;

	
	void validatePin() {
		
		
		for (int numOfAttempts = 1; numOfAttempts <= 3; numOfAttempts++) {
			
			System.out.println("Enter the PIN");
			enteredPin = sc.nextInt();
			if (enteredPin == actualPin) {
				isPinValid = true;
				System.out.println("Pin is correct");
				break;
			} else {
				isPinValid = false;
				System.out.println("Pin is incorrect");
			}
		}
	}

	void updatePIN() {
		actualPin = sc.nextInt();
	}

}
