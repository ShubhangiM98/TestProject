package decisionstatement;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d,e,avg;
		Scanner sc= new Scanner(System.in);
		System.out.println("enetr 5 numbers : ");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		d= sc.nextInt();
		e= sc.nextInt();
		avg=(a+b+c+d+e)/5;
		System.out.println("avg marks" +avg);
		

	}

}
