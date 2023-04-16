package staticExample;

public class Demo {
	int a=100;
	static int b=1000;
	
	//non static method can access static as well as non static
	void display()
	{
		System.out.println(a+" "+b);
	}
	
	//static can access only static members directly
	//non static members can be accessed with an object
	static void show()
	{
		System.out.println(b);
		Demo d=new Demo();
		System.out.println(d.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
