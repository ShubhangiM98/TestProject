package switchcase;

import java.util.Scanner;

public class NationalAnimalofCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the country name");
		String country = sc.nextLine();

		country = country.toLowerCase();

		switch (country) {
		case "india":
			System.out.println("tiger");
			break;
		case "australia":
			System.out.println("kangaroo");
			break;
		case "germany":
			System.out.println("eagle");
			break;
		case "bangladesh":
			System.out.println("bengal tiger");
			break;
		case "china":
			System.out.println("panda");
			break;
		default:
			System.out.println("enter valid country name");
		}
		sc.close();
	}

}
