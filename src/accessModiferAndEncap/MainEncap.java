package accessModiferAndEncap;

public class MainEncap {

	public static void main(String[] args) {

		BankAccount surya = new BankAccount("9784536", 5000, 1234);

		var bankDetails = String.format("Surya bank acc no details are %s", surya.getAccountDetails(1234));

		System.out.println(bankDetails.split(",")[0]);
		
		
		//Update Surya Bank Balance
		surya.setBalance(1234, -500, "9784536");
		bankDetails = String.format("Surya bank acc no details are %s", surya.getAccountDetails(1234));
		
		System.out.println(bankDetails.split(",")[1]);
		
		
		surya.setPin(1234, 321);
		
		surya.sinNo="1234";

	}

}
