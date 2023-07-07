package loopsExample;

public class PrintSuccessiveNumbers {

	int number;
	int finalNumber;

	// Print successive numbers but skip 13
	void printSuccssvNumbers() {
		while (number <= finalNumber) {		//finalNumber>=number
			if (number != 13) {
				System.out.println(number);
			}
//			number += 1;
			number++;		// number = number+1

//			if (number == 13) {
//				number += 1;
//			} else {
//				System.out.println(number);
//			}
//			number += 1;
		}
	}
	
	void printNumbersInReverse() {
		while(number<=finalNumber) {
			System.out.println(finalNumber);
			finalNumber--;
		}
	}
	
	//Print successive numbers but stop printing if 13 comes
	void printNumbersStopAt13() {
		while(number<=finalNumber) {
			if(number==13) {
				break;
			}
			System.out.println(number);
			number++;
		}
	}

}
