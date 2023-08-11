package inheritanceExample;

public class TD extends BankOfCanada {

	public TD() {
		System.out.println("TD Constructor executed");
	}
	
	public void issueLineOfCredit() {
		System.out.println("Td Line of Credit");
	}
	
	public void provideAccessToBalance() {
		System.out.println("TD provide access to balance");
	}
}
