package overriding;

public class Innova extends Car {
	
	//super keyword-immediate parent class
	//           used to call parent class overridden method
	//           call overridden variable

	void dashboard() {
		super.dashboard();
		System.out.println("Innova : charging slot,touch screen,AC,airbags");
	}

	void seatnumber() {
		System.out.println("Innova : 7 seat");
		super.seatNumber();
	}

}
