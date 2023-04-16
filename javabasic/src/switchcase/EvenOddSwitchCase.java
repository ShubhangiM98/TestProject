package switchcase;

import java.util.Scanner;

public class EvenOddSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		Scanner input= new Scanner(System.in);
		System.out.println("enter a number");
		a=input.nextInt();
		
		switch (a%2)
		{
		case '0':
			System.out.println("even number :" );
			break;
		case '1':
			System.out.println("odd number");
			break;
		}
		input.close();

	}

}
