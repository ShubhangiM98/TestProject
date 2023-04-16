package classandobjects;

import java.util.Scanner;

public class MainParameterized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParameterizedMethods pm1=new ParameterizedMethods();
		//pm1.add(100,1000);
		pm1.average(45.5f,30,76.3f,67,55.7f);
		
		Scanner sc= new Scanner(System.in);
		ParameterizedMethods pm2=new ParameterizedMethods();
		
		pm2.divide(10, 20);
		
		

	}

}
