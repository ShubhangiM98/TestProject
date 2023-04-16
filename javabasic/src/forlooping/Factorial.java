package forlooping;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,fac=1,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter  number");
		num= sc.nextInt();
		for( c=1; c<=num ; c++)
		{
			fac=fac*c;
			System.out.println(""+fac);
		}
	}

}
