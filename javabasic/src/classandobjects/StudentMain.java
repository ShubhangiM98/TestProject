package classandobjects;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Student s1 = new Student();

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the id, name, email, dept, marks");
		int i = sc.nextInt();
		String n = sc.next();
		String e = sc.next();
		String d = sc.next();
		double m = sc.nextDouble();

		s1.setData(i, n, e, d, m);

		Student s2 = new Student();
		System.out.println("enter the id, name,email,dept,marks");
		i = sc.nextInt();
		n = sc.next();
		e = sc.next();
		d = sc.next();
		m = sc.nextDouble();

		s2.setData(i, n, e, d, m);

		Student s3 = new Student();
		System.out.println("enter the id, name,email,dept,marks ");
		i = sc.nextInt();
		n = sc.next();
		e = sc.next();
		d = sc.next();
		m = sc.nextDouble();

		s3.setData(i, n, e, d, m);

		s1.display();
		s2.display();
		s3.display();

		sc.close();
	}

}
