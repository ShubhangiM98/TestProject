package test5_15apil;

public class Mastani implements IceCream, Juice {

	@Override
	public void drink() {
		System.out.println("she is drinking Mastani juice");
	}

	@Override
	public void eat() {
		System.out.println("she is eating Mastani Icecream");
	}
}
