package decisionstatement;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch;
		Scanner input= new Scanner(System.in);
		System.out.println("enter a character ");
	
		ch=input.next().charAt(0);	
		
		if(ch=='a' || ch=='A')
			System.out.println("character is vowel");
		else if(ch=='e' || ch=='E')
			System.out.println("character is vowel");
		else if (ch=='i'|| ch=='I')
			System.out.println("character is vowel");
		else if (ch=='o' || ch=='O')
			System.out.println("character is vowel");
		else
			System.out.println("character is consonant");
			
			
		

	}

}
