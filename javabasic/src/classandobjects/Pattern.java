package classandobjects;

import java.util.Scanner;

public class Pattern {

	Scanner sc= new Scanner(System.in);  // global variable common for all
	//retype method name(){}
	
	void upwardStarLeftPattern()
	{
		System.out.println("enter the row number");
		int r= sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void  downwardstarLeftPattern()
	{
		System.out.println("enter the row number");
		int r= sc.nextInt();
		for(int i=r;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void starpyramidpattern()	
	{
		System.out.println("enter the row number");
		int r= sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	}


