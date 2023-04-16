package classandobjects;
import java.util.Scanner;
public class ParameterizedMethods {

	void add(int a,int b)//local variable
	{
		System.out.println("addition is "+(a+b));
	}
	void multiply(int a,int b)
	{
		System.out.println("multiply is "+(a*b));
	}
	void divide(int a,int b)
	{
		Scanner sc=new Scanner(System.in);
		while(b==0 || b<0)
		{
			System.out.println("enter a valid non zero positive number");
			b=sc.nextInt();
		}
		System.out.println("divide is "+(a/b));
	}
	void average(float a,float b,float c,float d,float e)
	{
		float avg=(a+b+c+d+e)/5;
		System.out.println("average is "+avg);
	}

}
