package learnOperations;

public class ArithmeticOperators {
	
	int num1;
	int num2;
	
	void addTwoNumbers() {
		int sum = num1+num2;
		System.out.println("Sum of "+num1+" and "+num2+" is "+sum);
	}
	
	void subtractTwoNumbers() {
		int difference = num1-num2;
		System.out.println("Difference of "+num1+" and "+num2+" is "+difference);
	}
	
	void multiplyTwoNumbers() {
		int product = num1*num2;
		System.out.println("The product of "+num1+" and "+num2+" is "+product);
	}
	
	void divideTwoNumbers() {
		int quotient = num1/num2;
		int remainder = num1%num2;
		System.out.println("The quotient of "+num1+" and "+num2+" is "+quotient);
		System.out.println("The remainder of "+num1+" and "+num2+" is "+remainder);
	}
}
