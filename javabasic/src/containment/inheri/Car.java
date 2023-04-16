package containment.inheri;

public class Car {

	int id,number;
	String name;
	Driver dr;// object of driver class as a data member of car class
	
	public Driver getDr() {
		return dr;
	}
	public void setDr(Driver dr) {
		this.dr = dr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return id+" "+name+" "+number+" = "+dr;
	}


}
