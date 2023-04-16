package decisionstatement;
import java.util.Scanner;
public class Userinputexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float radius,area;
		System.out.println("enter a number :");
		Scanner SC= new Scanner(System.in);
		radius= SC.nextFloat();
		
		area=3.14f * radius * radius;
		System.out.println("area of circle" +area);

	}

}

