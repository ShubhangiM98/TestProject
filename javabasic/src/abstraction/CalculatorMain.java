package abstraction;

public class CalculatorMain {

	public static void main(String[] args) {
		
		ScientificCalculator o=new ScientificCalculator();
		
		System.out.println("Addition :"+o.add(5, 5));
		System.out.println("Substraction :"+o.substract(10, 5));
		System.out.println("multiplication :"+o.multiply(10, 5));
		System.out.println("Divisom :"+o.divide(10, 20));
		System.out.println("square:"+o.square(5));
	}

}
