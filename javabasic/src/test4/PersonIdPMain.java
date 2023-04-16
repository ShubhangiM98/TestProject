package test4;

public class PersonIdPMain {

	public static void main(String[] args) {
		
		IdProof i1=new IdProof("Pan Card","FNLPM6454M","12 April 2024");
		Person p1=new Person(1,"Miss Chetna","9876543210","Nagpur",i1);
		
		IdProof i2=new IdProof("Pan Card","HKFKP6454M","11 April 2024");
		Person p2=new Person(2,"Mr Vedant","9873216540","Nagpur",i2);
		
		IdProof i3=new IdProof("Pan Card","DGRSA6454M","25 April 2024");
		Person p3=new Person(1,"Miss Shreya","9871236540","Nagpur",i3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
