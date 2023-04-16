package abstraction;

public class SBI implements BankOperations {
	
	@Override
	public void deposit(){
		System.out.println("can deposit money from bank/ATM");
	}
	
	@Override
	public void withdraw(){
		System.out.println("can withdraw money from bank/ATM");
	}
	
	@Override
	public void loan(){
		System.out.println("Commercial loan,Educational loan,car loan are available");
	}
	
	@Override
	public void balanceCheck(){
		System.out.println("we can check our A/c balance");
	}
	@Override
	public void moneyTransfer(){
		System.out.println("we can tranfer money to other a/c");
	}

}
