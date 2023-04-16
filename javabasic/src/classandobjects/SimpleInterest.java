package classandobjects;

public class SimpleInterest {

	double product(int p, double r, float t) {
		return p * r * t;
	}

	void simpleInterestCal(double product) {
		System.out.println("Simple Interest is :" + (product / 100));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest obj = new SimpleInterest();
		double d = obj.product(3000, 4.5, 20);
		obj.simpleInterestCal(d);
	}

}
