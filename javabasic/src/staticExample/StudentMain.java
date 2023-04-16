package staticExample;

public class StudentMain {
	
	static int a;
	int b;
	
	static //its used in jdk 1.7
	{
		a=300;
		System.out.println("Block 1 :" +a);
	}
	static
	{
		System.out.println("Block 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Student.collegename);
		Student s1=new Student(101,"ram","it",74);
		Student s2=new Student(102,"raj","etc",65);
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
