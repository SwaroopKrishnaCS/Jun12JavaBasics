package inheritanceExample;

public class TDInvestment extends TD {

	public TDInvestment() {
		System.out.println("TD Investment Constructor is executed");
	}

	public void investCustMoney() {
		System.out.println("TD investment manages money for client");
	}

}
