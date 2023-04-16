package polymorphism;

public class AreaOfShapes {

	void area(int l, int b) {
		System.out.println("Area of Rectangle :" + (l * b));
	}

	void area(float s) {
		System.out.println("Area of Square :" + (s * s));
	}

	void area(double r) {
		System.out.println("Area of Circle :" + (3.14 * r * r));
	}

	void area(int b, double h) {
		System.out.println("Area of Triangle :" + (b * h / 2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfShapes obj1 = new AreaOfShapes();

		obj1.area(10, 20);
		obj1.area(40);
		obj1.area(3.4);
		obj1.area(40, 20.5);

	}

}
