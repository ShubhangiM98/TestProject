package containment.inheri;

public class Car1Driver1Main {

	public static void main(String[] args) {
		
		Driver1 d1=new Driver1(101,"Ram","9623162345");
		
		Car1 c1=new Car1(101,4250,"Swift",d1);
		
        System.out.println(c1);
	}

}
