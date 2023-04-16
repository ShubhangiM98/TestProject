package overriding;
class Bank
{
	void loan(){
		System.out.println("Every bank provide a loan");
	}
}
class SBI extends Bank
{
	void loan(){
		System.out.println("SBI provides Home loan only");
	}
}
class HDFC extends Bank
{
	void loan(){
		System.out.println("HDFC provides Educational loan");
	}
}
public class BankMain {

	public static void main(String[] args) {
		
    // use parent reference and store child class object
   // dynamic method dispatch	
		Bank b1;
		b1=new Bank();
		b1.loan();
		
		b1= new SBI();  // upcasting
		b1.loan();
		
		b1=new HDFC();   // upcasting
		b1.loan();
	}

}
