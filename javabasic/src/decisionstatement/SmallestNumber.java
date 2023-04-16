package decisionstatement;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d;
		Scanner input= new Scanner(System.in);
		System.out.println("enter 4 number");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		d=input.nextInt();
		
		if (a < b && b < c && c < d)
			System.out.println("smallest no is" + a);
		else if (b < a && b < c && b < d)
			System.out.println("smallest no is" + b);
		else if (c < a && c < b && c < d)
			System.out.println("Smallest no is" + c);
		else
			System.out.println("smallest no is :" + d);
		
		

	}

}
