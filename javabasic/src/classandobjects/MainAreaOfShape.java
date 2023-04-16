package classandobjects;

import java.util.Scanner;

public class MainAreaOfShape {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("1. Area Of Rectangle ");
		System.out.println("2. Area Of Triangle ");
		System.out.println("3. Area Of circle ");
		System.out.println("4. Area Of Square ");
		System.out.println("Enter The Shape");
		int ch = sc.nextInt();
		
		AreaOfShapes obj= new AreaOfShapes();
		switch(ch)
		{
		case 1:
			obj.areaOfRectangle();
			break;
		case 2:
			obj.areaOfTriangle();
			break;
		case 3:
			obj.areaOfCircle();
			break;
		case 4:
			obj.areaOfSquare();
			break;
			default:System.out.println("Please Enter valid Shape");
		}

	}

}
