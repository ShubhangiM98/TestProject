package encapsulation;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setId(100);
		e1.setName("neha");
		e1.setDept("hr");
		e1.setSalary(40000);
		e1.setContact("9623162345");

		System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getDept()
				+ " " + e1.getSalary() + " " + e1.getContact());

	}

}
