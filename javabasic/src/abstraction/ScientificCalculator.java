package abstraction;

public class ScientificCalculator implements Calculator {
	
	public int add(int a,int b){
		return a+b;
	}
	public int substract(int a,int b){
		return a-b;
	}
	public int multiply(int a,int b){
		return a*b;
	}
	public int divide(int a,int b){
		return a/b;
	}
	public int square(int a){
		return a*a;
	}
}
