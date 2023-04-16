package test5_15apil;

public class MachineMain {

	public static void main(String[] args) {
		Juicer obj=new Juicer();
		obj.crush();
		obj.rotate();
		obj.filter();
		System.out.println("................");
		Machine obj1=new Juicer();
		obj1.crush();
		obj1.rotate();
	}

}
