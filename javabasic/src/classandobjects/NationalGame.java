package classandobjects;

import java.util.Scanner;

public class NationalGame {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the country name");
		String country = sc.nextLine();
		
       country=country.toLowerCase();
       
       switch (country)
       {
       case "india":
    	   System.out.println("Hockey");
    	   break;
       case "china":
    	   System.out.println("Table Tennis");
    	   break;
       case "bangladesh":
    	   System.out.println("Kabbadi");
    	   break;
       case "italy":
    	   System.out.println(" Football");
    	   break;
       case "united state":
    	   System.out.println("baseball");
    	   break;
    	   default :System.out.println("Please Enter Valid State");
       }
	}

}
