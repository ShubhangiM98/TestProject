package decisionstatement;

import java.util.Scanner;

public class CharInputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		System.out.println("enter a char");
		Scanner sc= new Scanner(System.in);
		
		ch=sc.next().charAt(0);
		int ascii=ch;
		System.out.println("ascii value of character :"+ascii);
		
	
		

	}

}
