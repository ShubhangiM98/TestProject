package forlooping;

import java.util.Scanner;

public class Squareofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter  number");
		int num= sc.nextInt();
		
		for(int c=1; c<=num ; c++)
		{
			int sq=c*c;
			System.out.println(""+sq);
		}

	}

}
