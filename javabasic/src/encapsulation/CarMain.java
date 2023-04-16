package encapsulation;

public class CarMain {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.setId(101);
		c1.setName("scorpio");
		c1.setCompany("mahindra");
		c1.setPrice(900000);
		c1.setLaunchyear(2009);

		System.out.println(c1.getId() + " " + c1.getName() + " "
				+ c1.getComapny() + " " + c1.getPrice() + " "
				+ c1.getLaunchYear());

	}

}
