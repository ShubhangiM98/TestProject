package containment.inheri;

public class CarDriverMain {

	public static void main(String[] args) {

		Driver d1 = new Driver();
		d1.setId(1);
		d1.setName("Ram");
		d1.setContact("9876543210");

		Driver d2 = new Driver();
		d2.setId(2);
		d2.setName("Laxman");
		d2.setContact("9623162345");

		Car c1 = new Car();
		c1.setId(100);
		c1.setName("swift");
		c1.setNumber(1234);
		c1.setDr(d1);

		System.out.println(c1.getName() + " " + c1.getNumber() + " = "
				+ c1.getDr().getName() + " " + c1.getDr().getContact());

		Car c2 = new Car();
		c2.setId(101);
		c2.setName("Tata");
		c2.setNumber(2345);
		c2.setDr(d2);
		System.out.println(c2);

	}

}
