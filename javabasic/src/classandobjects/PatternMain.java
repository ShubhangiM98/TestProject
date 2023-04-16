package classandobjects;
import java.util.Scanner;
public class PatternMain {
	
	public static void main(String[] args) { // is used to call other method only
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		//obj.methodname();
		/*Pattern p1= new pattern();
		p1.upwardStarLeftPattern();
		System.out.println("___________");
		Pattern p2=new pattern();
		p2.downwardstarLeftPattern();*/
		
		System.out.println("1. upwardStarLeftPattern ");
		System.out.println("2. downwardstarLeftPattern");
		System.out.println("3. starpyramidpattern");
		System.out.println("enter your choice");
		int ch = sc.nextInt();
		
		Pattern obj= new Pattern();
		switch(ch)
		{
		case 1:
			obj.upwardStarLeftPattern();
			break;
		case 2:
			obj.downwardstarLeftPattern();
			break;
		case 3:
			obj.starpyramidpattern();
			break;
			default: System.out.println("enetr valid option.....");
		}

	}

}
