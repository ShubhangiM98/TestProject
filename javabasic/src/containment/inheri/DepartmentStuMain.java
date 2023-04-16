package containment.inheri;

public class DepartmentStuMain {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setIdS(1);
		s1.setMarks(67);
		s1.setName("Paras");
		s1.setEmail("paras123@gmail.com");

		Department d1 = new Department();
		d1.setidD(101);
		d1.setName("IT");
		d1.setSr(s1);

		System.out.println("idD:-"+d1.getidD() + "\nDep Name:-" + d1.getName() + "\nName: "
				+ d1.getSr().getName() + " " + d1.getSr().getMarks() + " "
				+ d1.getSr().getEmail());

	}

}
