package interfaceBank;

public abstract class CentralBankOfCanada {

	public void openBankAccount() {
		System.out.println("Opening bank account");
	}

	public void provideAccessToInternetBanking() {
		System.out.println("Provide Internet banking access");
	}
	
	public abstract void provideCC();

}
