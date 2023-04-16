package encapsulation;

import java.util.Scanner;

public class FacultyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id,name,contact,subject,salary of Faculty");
		int id = sc.nextInt();
		String name = sc.next();
		String contact = sc.next();
		String subject = sc.next();
		int salary = sc.nextInt();

		Faculty f1 = new Faculty();
		f1.setId(id);
		f1.setName(name);
		f1.setcontact(contact);
		f1.setSubject(subject);
		f1.setSalary(salary);
		System.out.println(f1.getId() + " " + f1.getName() + " "
				+ f1.getContact() + " " + f1.getSubject() + " "
				+ f1.getsalary());
		System.out.println("...................................");
		
		System.out.println("Enter id,name,contact,subject,salary of Faculty");
		Faculty f2 = new Faculty();
		id = sc.nextInt();
		name = sc.next();
		contact = sc.next();
		subject = sc.next();
		salary = sc.nextInt();
		f2.setId(id);
		f2.setName(name);
		f2.setcontact(contact);
		f2.setSubject(subject);
		f2.setSalary(salary);
		System.out.println(f2.getId() + " " + f2.getName() + " "
				+ f2.getContact() + " " + f2.getSubject() + " "
				+ f2.getsalary());

	}

}
