package containment.inheri;

public class Department {
	int idD;
	String name;
	Student sr;
	
	public Student getSr(){
		return sr;
	}
	public void setSr(Student sr){
		this.sr=sr;
	}
	
	public int getidD(){
		return idD;
	}
	public void setidD(int idD){
		this.idD=idD;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}

}
