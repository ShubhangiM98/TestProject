package test5_15apil;

public abstract class Machine {
	
	void rotate(){
		System.out.println("Machine is rotating");
	}
	abstract void crush();

}
class Juicer extends Machine{
	
	@Override
	void crush(){
		System.out.println("Juicer crush");
	}
	
	void filter(){
		System.out.println("Juice is filter");
	}
}
