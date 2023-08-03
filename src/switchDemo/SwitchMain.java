package switchDemo;

import accessModiferAndEncap.BankAccount;

public class SwitchMain {

	public static void main(String[] args) {

		
		SwitchExample calculator = new SwitchExample();
		
		System.out.println(calculator);

		calculator.num1 = 10;
		calculator.num2 = 0;
		calculator.operationRequested = "divide";

		
		calculator.performOperation();
		
		

	}

}
