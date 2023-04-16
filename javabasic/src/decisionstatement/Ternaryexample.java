package decisionstatement;

import java.util.Scanner;

public class Ternaryexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter a number: ");
		a= sc.nextInt();
		
		String s=a%2==0?"even number" : "odd number";
		System.out.println(s);
		

	}

}
