package whilelooping;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s = 1; // initialization start
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the end point");
		int end = sc.nextInt();
		// condition
		while (s <= end) {
			if (s % 2 == 0) {
				System.out.println(s + "");
			}
			s++; // iteration(inc/dec)
		}
		System.out.println("done");
		sc.close();

	}

}
