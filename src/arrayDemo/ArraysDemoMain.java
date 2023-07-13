package arrayDemo;

import java.util.Arrays;

public class ArraysDemoMain {

	public static void main(String[] args) {
		
		ArrayExample primeArray = new ArrayExample();

		System.out.println(Arrays.toString(primeArray.primeNumbers));
		
		System.out.println(Arrays.toString(primeArray.primeNum));
		
		primeArray.addValuesToArray();
		
		System.out.println(Arrays.toString(primeArray.primeNum));
		
		primeArray.populateRollNumArray();
		
		System.out.println(Arrays.toString(primeArray.rollNum));

	}

}
