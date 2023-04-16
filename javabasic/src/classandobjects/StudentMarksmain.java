package classandobjects;

public class StudentMarksmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMarksExample s1=new StudentMarksExample();
		StudentMarksExample s2=new StudentMarksExample();
		 s1.setData(100," noor", 85, 45, 75);
		 s2.setData(104," navi", 50, 85, 69);
		 
		 float per=s1.percentage();
		 s1.grade(per);
		 

	}

}
