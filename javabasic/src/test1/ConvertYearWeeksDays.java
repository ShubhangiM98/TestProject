package test1;

import java.util.Scanner;

public class ConvertYearWeeksDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, year, week, Day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number Of Days");
		num = sc.nextInt();
		year = num / 365;
		System.out.println("Number Of Years :" + year);

		week = (num % 365) / 7;
		System.out.println("Number Of weeks :" + week);

		Day = num - ((year * 365) + (week * 7));
		System.out.println("Number Of Days :" + Day);

		sc.close();

	}

}
