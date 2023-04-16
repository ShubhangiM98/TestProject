package overriding;

public class CarSwiftInnMain {

	public static void main(String[] args) {

		Swift s1 = new Swift();

		s1.wheelNo();
		s1.gears();
		s1.dashboard();

		System.out.println("------------------------------");

		Innova i1 = new Innova();

		i1.wheelNo();
		i1.dashboard();
		i1.seatnumber();

	}

}
