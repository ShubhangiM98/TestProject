package test3;

public class AddressMain {

	public static void main(String[] args) {

		Address a1 = new Address("Nagpur", "MH", "India");
		Person p1 = new Person("neha", "Female", 20, "address");

		System.out.println("Name :" + p1.getName() + "Gender :"
				+ p1.getGender() + "Age :" + p1.getAge() + "Address :"
				+ a1.getCity() + a1.getState() + a1.getCountry());

	}

}
