package decisionstatement;

import java.util.Scanner;

public class AvearageGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e;
		double avg;
		Scanner input= new Scanner(System.in);
		System.out.println("enter 5 sub marks");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		d=input.nextInt();
		e=input.nextInt();
		avg=(a+b+c+d+e)/5;
		System.out.println("avg of 5 no :" +avg);
		
		if(avg>=90 && avg <=100)
			System.out.println("a+ grade");
		else if(avg>=80 && avg<=89)
			System.out.println("a grade");
		else if(avg>=70 && avg<=79)
			System.out.println("b grade");
		else if(avg>=60 && avg<=69)
			System.out.println("c grade");
		else
			System.out.println("fail");
		input.close();


	}

}
