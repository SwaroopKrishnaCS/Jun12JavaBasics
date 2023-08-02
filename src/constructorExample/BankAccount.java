package constructorExample;

public class BankAccount {

	String accountNo;
	String nameOfAccountHolder;
	double balance;
	String statusInCanada;

	BankAccount(String accNo, String name, double bal) {
		accountNo = accNo;
		nameOfAccountHolder = name;
		balance = bal;
	}

	BankAccount(String accNo, String name, double bal, String canadaStatus) {
		accountNo = accNo;
		nameOfAccountHolder = name;
		balance = bal;
		statusInCanada = canadaStatus;
	}

	public BankAccount() {
		System.out.println("This is a non paramterised constructor");
	}

	void setUpAccountInfo(String accNo, String name, double bal) {
		accountNo = accNo;
		nameOfAccountHolder = name;
		balance = bal;

	}

}
