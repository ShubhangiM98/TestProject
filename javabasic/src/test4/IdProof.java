package test4;

public class IdProof {

	String name,number,validity;
	
	IdProof(String name,String number,String validity){
		this.name=name;
		this.number=number;
		this.validity=validity;
	}
	
	public String toString(){
		return "|| IdProof= "+name+",IdNumber="+number+",Validity= "+validity;
	}
}
