package classandobjects;

import java.util.Scanner;

public class EmployeeParaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeePara e1=new EmployeePara();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id, name , dept, contact,salary");
		int i=sc.nextInt();
		String n=sc.next();
		String d=sc.next();
		String c=sc.next();
		double s=sc.nextDouble();
		
		e1.Setdata(i, n, d, c, s);
		
		EmployeePara e2=new EmployeePara();
		
		System.out.println("enter the id, name , dept, contact,salary");
		i=sc.nextInt();
		n=sc.next();
		d=sc.next();
		c=sc.next();
		s=sc.nextDouble();
		
		e2.Setdata(i, n, d, c, s);
		
		e1.display();
		e2.display();

	}

}
