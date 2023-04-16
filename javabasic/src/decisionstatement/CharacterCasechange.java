package decisionstatement;

import java.util.Scanner;

public class CharacterCasechange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a character");
		ch=sc.next().charAt(0);
		
		if(ch>='a' && ch<='z') //a=97 b=98 A=65
		{
			int i=ch-32; // implicit
			System.out.println((char)i);
		}
		else if (ch>='A' && ch<='Z')
		{
			int i=ch+32;
			System.out.println((char)i);
		}
		else
			System.out.println("enter valid alphabet");
	}

}
