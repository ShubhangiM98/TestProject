package abstraction;

public class BankMain {

	public static void main(String[] args) {
		
		SBI obj=new SBI();
		obj.deposit();
		obj.withdraw();
		obj.loan();
		obj.balanceCheck();
		obj.moneyTransfer();

	}

}
