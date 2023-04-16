package classandobjects;

public class Student {

	int id;
	String name, email, dept;
	double marks;

	void setData(int i, String n, String e, String d, double m) {
		id = i;
		name = n;
		email = e;
		dept = d;
		marks = m;

	}

	void display() {
		System.out.println(id + " " + name + " " + email + " " + dept + " "
				+ marks);
	}

	

}
