package switchcase;

import java.util.Scanner;

public class NoOfDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month;
		int days;
		Scanner input = new Scanner(System.in);
		System.out.println("enter month no");
		month = input.nextInt();

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("30 days month");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("31 days month");
			break;
		case 2:
			System.out.println("28 days month");
			break;
		default:
			System.out.println("invalid month");
		}
		input.close();
	}

}
