package containment.inheri;

public class Driver1 {

	int id;
	String name,contact;
	
	Driver1(int id,String name,String contact){
		this.id=id;
		this.name=name;
		this.contact=contact;
	}
	public String toString(){
		return id+" "+name+" "+contact;
	}

}
