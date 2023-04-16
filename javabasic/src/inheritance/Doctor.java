package inheritance;

public class Doctor extends PersonDrP {

	int idD;
	String Specialization, hospital;

	public int getId() {
		return idD;
	}

	public void setId(int id) {
		this.idD = id;
	}

	public String getSpecialization() {
		return Specialization;
	}

	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	void display() {
		System.out.println(idD + " " + name + " " + contact + " " + adhar + " "
				+ address + " " + Specialization + " " + hospital);
	}

}
