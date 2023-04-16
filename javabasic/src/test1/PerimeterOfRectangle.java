package test1;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Length and breadth of Rectangle");
		float Length = in.nextInt();
		float Breadth = in.nextInt();
		float Perimeter;

		Perimeter = 2 * (Length + Breadth);
		System.out.println("Perimeter of Rectangle is :" + Perimeter);

		in.close();

	}

}
