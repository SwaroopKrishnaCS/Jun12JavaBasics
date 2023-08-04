package inheritanceExample;

public class InheritanceExample {

	public static void main(String[] args) {
		
		
		BankOfCanada boc=new BankOfCanada();
		
		TD td=new TD();
		
		RBC rbc=new RBC();
		
		
		TDInvestment invest=new TDInvestment();
		
		
		invest.openBankAcc();
		invest.issueLineOfCredit();
		invest.investCustMoney();
	
	
	}

}
