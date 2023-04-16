package constructor;

import java.util.Scanner;

public class FacultyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id,name,subject,college,salary of Faculty");
		int id = sc.nextInt();
		String name = sc.next();
		String subject = sc.next();
		String college = sc.next();
		int salary = sc.nextInt();
		Faculty f1 = new Faculty(id, name, subject, college, salary);
		System.out.println(f1);

		System.out.println("................................");
		System.out.println("enter id,name,subject,college,salary of Faculty");
		id = sc.nextInt();
		name = sc.next();
		subject = sc.next();
		college = sc.next();
		salary = sc.nextInt();
		Faculty f2 = new Faculty(id, name, subject, college, salary);
		System.out.println(f2);

		System.out.println("................................");
		System.out.println("enter id,name,subject,college,salary of Faculty");
		id = sc.nextInt();
		name = sc.next();
		subject = sc.next();
		college = sc.next();
		salary = sc.nextInt();
		Faculty f3 = new Faculty(id, name, subject, college, salary);
		System.out.println(f3);

	}

}
