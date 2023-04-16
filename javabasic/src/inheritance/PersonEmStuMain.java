package inheritance;

public class PersonEmStuMain {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setEid(100);
		e1.setName("Vedant");
		e1.setContact("9876543210");
		e1.setSalary(50000);
		e1.setDept("Quality");
		e1.setAddress("Nagpur");
		e1.display();
		e1.pfCalculation();

		System.out.println("---------------------");

		Student s1 = new Student();
		s1.setSid(49);
		s1.setName("Shreya");
		s1.setContact("9638527410");
		s1.setAddress("pune");
		s1.setPercent(75);
		s1.display();
		s1.grade();

	}

}
