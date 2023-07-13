package arrayDemo;

public class ArrayExample {

	// Store values of same type and nature
	// Store first 5 prime numbers
	// Declare an array

	// type name = value
	int[] primeNumbers = { 2, 3, 5, 7, 11 };

	// length of the array = number of elements in an array

	// Declaring an array 2nd way

	int[] primeNum = new int[5];

	int[] rollNum = new int[50];

	void addValuesToArray() {
		primeNum[0] = 2;
		primeNum[1] = 3;
		primeNum[2] = 5;
		primeNum[3] = 7;
		primeNum[4] = 11;

	}

	void populateRollNumArray() {
		
		for(int i =0;i<50;i++) {
			rollNum[i] = i+1;
		}
	}

}
