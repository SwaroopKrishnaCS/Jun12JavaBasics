package learnOperations;

public class OperatorsMain {

	public static void main(String[] args) {
		
		ArithmeticOperators ao = new ArithmeticOperators();
		
		ao.addTwoNumbers();
		
//		Assigning the values
		ao.num1 = 8;
		ao.num2 = 10;
//		
		//Invoking the method
		ao.addTwoNumbers();
		
		ao.subtractTwoNumbers();
		
		System.out.println("Reassigning the values");
		//Reassigning the values/ Updating the values
		ao.num1 = 15;
		ao.num2 = 6;

		ao.addTwoNumbers();
//		
		ao.subtractTwoNumbers();
		
		ao.multiplyTwoNumbers();
		
		ArithmeticOperators ao1 = new ArithmeticOperators();
		
		ao1.num1 = 45;
		ao1.num2 = 10;
		ao1.divideTwoNumbers();
		
		
		AssignmentOperator ao2 = new AssignmentOperator();
		
		ao2.findAgeAfter5Years();
		
		ao2.findAgeBefore10Years();
	}

}
