package abstraction;
//constructor chaining : calling one constructor to another constructor
public class A {

	A() {
		this(10);
		System.out.println("in default constructor");
	}

	A(int a) {
		this(10, 20);
		System.out.println("in single parameter constructor");
	}

	A(int a, int b) {
		this(10, 20, 30);
		System.out.println("in double parameter constructor");
	}

	A(int a, int b, int c) {
		
		System.out.println("in 3 parameter constructor");
	}

	public static void main(String[] args) {

		A obj = new A();

	}

}
