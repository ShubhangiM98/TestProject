package test2;

import java.util.Scanner;

public class Box {

	void boxValue() {

		Scanner sc = new Scanner(System.in);

		double length = sc.nextDouble();
		double width = sc.nextDouble();
		double height = sc.nextDouble();

		double volume = length * width * height;

		System.out.println("The volume of box is = " + volume);

		sc.close();
	}

}

