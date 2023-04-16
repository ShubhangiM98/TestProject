package containment.inheri;

public class Car1 {
	
	int id,number;
	String name;
	Driver1 dr;
	
	Car1(int id,int number,String name,Driver1 dr){
		this.id=id;
		this.number=number;
		this.name=name;
		this.dr=dr;
	}
	public String toString(){
		return id+" "+number+" "+name+" = "+dr;
	}

}
