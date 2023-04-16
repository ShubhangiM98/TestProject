package switchcase;

import java.util.Scanner;

public class StateAndCapitals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the state name");
		String state = sc.nextLine();

		state = state.toLowerCase();

		switch (state) {
		case "maharashtra":
			System.out.println("mumbai");
			break;
		case "karnataka":
			System.out.println("banglore");
			break;
		case "gujrat":
			System.out.println("gandhinagar");
			break;
		case "uttar pradesh":
			System.out.println("lacknow");
			break;
		case "goa":
			System.out.println("panji");
			break;
		default:
			System.out.println("enter valid state name");
		}
		sc.close();

	}

}
