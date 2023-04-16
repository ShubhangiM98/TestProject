package forlooping;

import java.util.Scanner;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		
		for(i=2 ;i<=num ;i+=2 )
		{
			sum=sum+i;
			
		}
		
		System.out.println("sum of even number :"+sum);
	}

}
