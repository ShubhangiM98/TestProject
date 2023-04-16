package whilelooping;

public class PowerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5, power = 3, ans = 1; // 5^3=5*5*5

		int c = 1;
		while (c <= power) // c=1 c=2
		{
			ans = ans * 5; // ans=ans*5=5 ans=5*5=25
			c++;
		}
		System.out.println("answer is :" + ans);
	}

}
 