package test4;

public class Person {
	
	int id;
	String name,contact,address;
	IdProof idp;
	
	Person(int id,String name,String contact,String address,IdProof idp){
		this.id=id;
		this.name=name;
		this.contact=contact;
		this.address=address;
		this.idp=idp;
	}
	public String toString(){
		return id+")Name= "+name+",Contact No= "+contact+",Address= "+address+" "+idp;
	}

}
