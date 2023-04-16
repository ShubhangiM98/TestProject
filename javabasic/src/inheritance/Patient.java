package inheritance;

public class Patient extends PersonDrP {

	int idP, room_no;
	String disease;

	public int getIdP() {
		return idP;
	}

	public void setIdP(int idP) {
		this.idP = idP;
	}

	public int getRoom_no() {
		return room_no;
	}

	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	void display() {
		System.out.println(idP + " " + name + " " + contact + " " + adhar + " "
				+ address + " " + room_no + " " + disease);
	}

}
