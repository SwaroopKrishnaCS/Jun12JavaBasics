package accessModiferAndEncap;

public class BankAccount {

	private String bankAccountNo;
	private double bal;
	private int pin;
	String sinNo;

	public BankAccount(String bankAccountNo, double bal, int pin) {
		this.bankAccountNo = bankAccountNo;
		this.bal = bal;
		this.pin = pin;
	}

	private String getAccountNo() {
		return bankAccountNo;
	}

	private double getBalance() {
		return bal;
	}

	public String getAccountDetails(int accPin) {
		if (pin == accPin) {
			return getAccountNo() + "," + getBalance();
		}
		return "Incorrect Pin";
	}

	public void setBalance(int pin, double balance, String accNo) {
		if (this.pin == pin && bankAccountNo.equals(accNo)) {
			this.bal = this.bal + balance;
		}
	}

	public void setPin(int oldPin, int newPin) {

		if (this.pin == oldPin && newPin > 0 && String.valueOf(newPin).toCharArray().length == 4) {
			oldPin = newPin;
		} else {
			System.out.println("New Pin doesn't match the required criteria");
		}
	}

}
