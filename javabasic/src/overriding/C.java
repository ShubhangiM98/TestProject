package overriding;
class A{
	/*A()
	{
		System.out.println("A class constructor");
	}*/
	A(int a)
	{
		System.out.println("A class constructor :"+a);
	}
}
class B extends A
{
	B()
	{
		super(10);
		System.out.println("B class constructor");
	}
}
public class C extends B {
	C()
	{
		System.out.println("C class constructor");
	}

	public static void main(String[] args) {
		
		C obj=new C();
		

	}

}
