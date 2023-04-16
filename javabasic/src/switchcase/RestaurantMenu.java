package switchcase;

import java.util.Scanner;

public class RestaurantMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menu;
		int Mquantity = 0, Mtotal = 0, pay = 0;

		System.out.println("Menu Card");
		System.out
				.println("1.Maharastrian Thali 160Rs\n2.Panjabi Thali180Rs\n3.Chicken Thali 200\n4.Biryani 120Rs\n5.Fish Thali 160Rs");
		System.out.println("choose Item");
		menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("enter the quantity of Maharastrian Thali ");
			Mquantity = sc.nextInt();
			Mtotal = Mquantity * 160;

			pay = pay + Mtotal;
			break;
		case 2:
			System.out.println("enter the quantity of Panjabi Thali ");
			Mquantity = sc.nextInt();
			Mtotal = Mquantity * 180;
			pay = pay + Mtotal;
			break;
		case 3:
			System.out.println("enter the quantity of Chicken Thali ");
			Mquantity = sc.nextInt();
			Mtotal = Mquantity * 200;
			pay = pay + Mtotal;
			break;
		case 4:
			System.out.println("enter the quantity of Biryani ");
			Mquantity = sc.nextInt();
			Mtotal = Mquantity * 120;
			pay = pay + Mtotal;
			break;
		case 5:
			System.out.println("enter the quantity of Fish Thali  ");
			Mquantity = sc.nextInt();
			Mtotal = Mquantity * 120;
			pay = pay + Mtotal;
			break;
		default:
			System.out.println("you choose invalid item");

		}
		System.out.println("Total  :" + Mtotal);
		sc.close();
	}

}
