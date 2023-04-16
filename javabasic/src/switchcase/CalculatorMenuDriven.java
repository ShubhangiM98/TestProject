package switchcase;

import java.util.Scanner;

public class CalculatorMenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out
				.println("1.Addition\n2. Multiplication\n3. Substraction\n4. division");
		System.out.println("Enter the option");
		int option = sc.nextInt();

		switch (option) {
		case 1:
			System.out.println("addition is;" + (a + b));
			break;
		case 2:
			System.out.println("multiplication is;" + (a * b));
			break;
		case 3:
			System.out.println("substraction is;" + (a - b));
		case 4:
			if (b == 0) {
				System.out
						.println("divisior should not be zero please enter valid number");
				b = sc.nextInt();
				System.out.println("divion is;" + (a / b));
			} else
				System.out.println("division is;" + (a / b));
			break;

		default:
			System.out.println("enter valid option");
		}
		sc.close();
	}

}
