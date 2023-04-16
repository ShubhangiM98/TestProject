package whilelooping;

import java.util.Scanner;

public class AdditionOfOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, s = 1, oddsum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		n = sc.nextInt();

		while (s <= n) {
			oddsum = oddsum + s;
			s = s + 2;
		}
		System.out.println("Sum of odd number is " + oddsum);
		sc.close();
	}

}
