package javabasic;

public class Assign1converttemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		double celcius=25.5,fahrenheit=50;
		fahrenheit=(celcius*1.8)+32;
		celcius=(fahrenheit-32)/1.8;
		System.out.println("temperature in fahrenheit :" +fahrenheit);
		System.out.println("temperature in celcius :" +celcius);

	}

}
