package conditionalStatement;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {

		Account suryaAccount = new Account();

		Scanner sc = new Scanner(System.in);

		suryaAccount.balanceAmount = 7850.45;

		suryaAccount.overdraftAmount = 10000;
		suryaAccount.pinNumber = 1234;

		System.out.println("Enter the PIN number");

		suryaAccount.enteredPin = sc.nextInt();

		System.out.println("Enter the amount to withdraw");

		suryaAccount.withdrawAmount = sc.nextInt();

		suryaAccount.validatePinAndWithdrawCash();

//		suryaAccount.atmWithdrawal();

	}

}
