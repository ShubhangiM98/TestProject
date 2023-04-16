package test3;

public class DepartmentMain {

	public static void main(String[] args) {

		Department d1 = new Department(101, "cse");
		Student s1 = new Student(1, "neha", "IT");

		System.out.println("Name :" + s1.getName() + "Id :" + d1.getId()
				+ "Roll No :" + s1.getroll() + "Department: " + s1.getdept());

	}

}
