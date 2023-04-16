package classandobjects;

public class Demo {

	public static void main(String[] args) {
		
		int a=2345;
		int sum=0;
		while (a>0){
			int b=a%10;
			if(b%2!=0){
				sum+=b;
			}
			a/=10;
		}
		System.out.println("sum of odd digit no is"+sum);

	}

}
