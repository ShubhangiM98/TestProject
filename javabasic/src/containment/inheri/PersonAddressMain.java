package containment.inheri;

public class PersonAddressMain {

	public static void main(String[] args) {

		Address a1 = new Address("Nagpur", "Maharashtra", "India");

		Person p1 = new Person(12, "ram", "9623162345", a1);
		Person p2 = new Person(45, "Reshma", "9876543210", new Address("pune",
				"MH", "India"));

		System.out.println(p1);
		System.out.println(p2);

	}

}
