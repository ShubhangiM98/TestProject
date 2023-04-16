package containment.inheri;

public class EmployeeCompanyMain {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.setId(100);
		e1.setName("Ram");
		e1.setDept("HR");
		e1.setSalary(50000);

		Company c1 = new Company();
		c1.setId(1);
		c1.setName("TCS");
		c1.setAddress("Nagpur");
		c1.setEm(e1);

		System.out.println(c1.getId() + " " + c1.getName() + " "
				+ c1.getAddress() + " => " + c1.getEm().getName() + " "
				+ c1.getEm().getDept() + " " + c1.getEm().getSalary());

	}

}
