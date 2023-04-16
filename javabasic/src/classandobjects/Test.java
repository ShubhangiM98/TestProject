package classandobjects;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//523
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		num=sc.nextInt();
		
		while(num>0){
			int a=num%10;
			sum=sum+a;
			num=num/10;
		}
		System.out.println("sum :-"+sum);

	}

}
