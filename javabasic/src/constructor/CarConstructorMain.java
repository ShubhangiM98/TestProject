package constructor;

import java.util.Scanner;

public class CarConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CarConstructorEx c1 = new CarConstructorEx();

		System.out.println("enter id,name,company,price of the car");
		int id = sc.nextInt();
		String name = sc.next();
		String company = sc.next();
		int price = sc.nextInt();
		CarConstructorEx c2 = new CarConstructorEx(id, name, company, price);

		System.out.println(c1);
		System.out.println(c2);
		
		sc.close();

	}

}
