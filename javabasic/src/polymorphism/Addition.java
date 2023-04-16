package polymorphism;

public class Addition {
	
	 void add(int a,int b)
	 {
		 System.out.println("Addion of interger :"+(a+b));
	 }
	 void add(int a,int b,int c) // no of parameters different
	 {
		 System.out.println("Addion of 3 interger :"+(a+b+c));
	 }
	 void add (String a,String b)// data type of parameters are different
	 {
		 System.out.println("Addion of String :"+(a+b));
	 }
	 void add(int a,String b)
	 {
		 System.out.println("Addition of integer and String:"+(a+b));
	 }
	 void add(String a,int b) //sequence of parameter is different
	 {
		 System.out.println("Addition of String & integer :"+(a+b));
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition obj=new Addition();
		obj.add(100, 102);
		obj.add("abc", "xyz");
		obj.add("abc", 25);
		

	}

}
