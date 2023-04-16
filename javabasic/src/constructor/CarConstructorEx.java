package constructor;

public class CarConstructorEx {

	int id, price;
	String name, company;

	CarConstructorEx() {
		id = 1;
		name = "name";
		company = "company";
		price = 1;
	}

	CarConstructorEx(int id, String name, String company, int price) {
		this.id = id;
		this.name = name;
		this.company = company;
		this.price = price;
	}

	public String toString() {
		return id + " " + name + " " + company + " " + price;
	}

}
