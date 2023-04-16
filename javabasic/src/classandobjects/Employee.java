package classandobjects;
import java.util.Scanner;
public class Employee {

	int id;
	String name,dept,contact;
	double salary;
	
	void setdata()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id, name , contact, dept,salary");
	int i=sc.nextInt();
	String n=sc.next();
	String d=sc.next();
	String c=sc.next();
	double s=sc.nextDouble();
	
	id=i;
	name=n;
	contact=c;
	dept=d;
	salary=s;
}
	void display()
	{
		System.out.println(id+" "+dept+" "+contact+" "+salary);
	}
	
}
