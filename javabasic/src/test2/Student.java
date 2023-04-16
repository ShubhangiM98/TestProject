package test2;

import java.util.Scanner;

public class Student {

	Scanner sc = new Scanner(System.in);

	double physics, maths, chemistry, biology;

	void stuData() {

		physics = sc.nextDouble();
		maths = sc.nextDouble();
		chemistry = sc.nextDouble();
		biology = sc.nextDouble();

		double avg = (physics + maths + chemistry + biology) / 400;
		double percentage = avg * 100;

		if (percentage >= 70)
			System.out.println("1st class with Destinction =" + percentage
					+ "%");
		else if (percentage >= 60 && percentage < 70)
			System.out.println("1st class =" + percentage + "%");
		else if (percentage >= 50 && percentage < 60)
			System.out.println("2nd class =" + percentage + "%");
		else if (percentage >= 40 && percentage < 50)
			System.out.println("pass class =" + percentage + "%");
		else
			System.out.println("Fail");

	}
}
