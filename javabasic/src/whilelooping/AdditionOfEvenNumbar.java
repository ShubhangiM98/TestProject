package whilelooping;

import java.util.Scanner;

public class AdditionOfEvenNumbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, s = 2, evensum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		n = sc.nextInt();

		while (s <= n) {
			evensum = evensum + s;
			s = s + 2;
		}
		System.out.println("Sum of even number is " + evensum);

		sc.close();
	}

}
