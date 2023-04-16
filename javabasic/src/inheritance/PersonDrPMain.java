package inheritance;

public class PersonDrPMain {

	public static void main(String[] args) {

		Doctor d1 = new Doctor();

		d1.setId(101);
		d1.setName("Dr Ankita");
		d1.setContact("9638527410");
		d1.setAdhar("789456123012");
		d1.setAddress("Nagpur");
		d1.setSpecialization("Pathology");
		d1.setHospital("Alexix Hospital");
		d1.display();

		System.out.println("------------------------------------------");

		Patient p1 = new Patient();

		p1.setIdP(1);
		p1.setName("Mr.Raj");
		p1.setContact("9873216540");
		p1.setAdhar("321654987012");
		p1.setAddress("Nagpur");
		p1.setRoom_no(504);
		p1.setDisease("Tuberculosis");
		p1.display();
	}

}
