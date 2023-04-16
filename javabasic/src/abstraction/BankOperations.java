package abstraction;

public interface BankOperations {
	
	float homeLoan=7.5f;  // public static final
	
	void deposit();
	void withdraw();
	void loan();
	void balanceCheck();
    void moneyTransfer();
}
