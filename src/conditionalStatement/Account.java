package conditionalStatement;

public class Account {

	double balanceAmount;

	int withdrawAmount;

	int overdraftAmount;

	int pinNumber;

	int enteredPin;

	// If customer has enough balance (balanceAmount >= withdrawAmount)
	// (OR) ||
	// If the customer has enough overDraft (overdraft>=withdrawamount)

	void atmWithdrawal() {

		if (balanceAmount >= withdrawAmount || overdraftAmount >= withdrawAmount) {
			System.out.println("Customer can withdraw cash");
		} else {
			System.out.println("Not enough balance");
		}
	}

	void validatePinAndWithdrawCash() {
		if (enteredPin == pinNumber) {
			System.out.println("PIN is correct");
			if (balanceAmount >= withdrawAmount || overdraftAmount >= withdrawAmount) {
				System.out.println("Customer can withdraw cash");
			} else {
				System.out.println("Not enough balance");
			}
		}else {
			System.out.println("Invalid PIN");
		}
	}

}
