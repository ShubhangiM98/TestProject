package whilelooping;

import java.util.Scanner;

public class FirstExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s = 1; // initialization start
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the end point");
		int end = sc.nextInt(); // 5
		// condition
		while (s <= end) {
			System.out.println(s + "");
			s++; // iteration(inc/dec)
		}
		System.out.println("done");
		sc.close();
	}

}
