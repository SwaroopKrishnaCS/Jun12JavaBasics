package methodExample;

import java.util.Scanner;

public class MethodExampleMain {

	public static void main(String[] args) {

		MethodBasic mExample1 = new MethodBasic();

		mExample1.sumOfTwoNumbers();

		int value = mExample1.diffOfTwoNumbers();

		System.out.println("Multiplied value id " + (value * 10));

		boolean isAvailable = mExample1.isCarAvailable();

		System.out.println("The car is available " + isAvailable);

		String lastName = mExample1.getName();

		System.out.println("Full name is " + "Manvir " + lastName);

		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$44 */

		// Parameterised Method

		MethodParameters mParameters = new MethodParameters();

		int sum = mParameters.sumOfTwoNumbers(25005, 10350);

		System.out.println("Sum= " + sum);

		String lName = mParameters.getLastName("Salinder");
		
		System.out.println("The last name " + lName);
		
		
		Scanner sc=new Scanner(System.in);
		String brand=sc.next();
		
		boolean isBrandAvailable=mParameters.isBrandAvailable(brand);
		
		System.out.println("The requested brand is available: "+isBrandAvailable);
		
		/* $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$44 */
		
		//Demo
		
		MethodDemo mDemo=new MethodDemo();
		boolean isEligible=mDemo.isEligbleToVote(21, true);
		
		System.out.println(isEligible);
		
	}
}
