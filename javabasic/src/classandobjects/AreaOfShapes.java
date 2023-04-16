package classandobjects;

import java.util.Scanner;

public class AreaOfShapes {

	
		Scanner sc= new Scanner(System.in);
		
		void areaOfRectangle()
		{
			System.out.println("enter the length and breadth of rectangle");
			double length=sc.nextInt();
			double breadth=sc.nextInt();
			double area;
			area=length*breadth;
			System.out.println("Area Of Rectangle is :"+area);
		}
        void areaOfTriangle()
        {
        	System.out.println("enter the Base and height of triangle");
        	double b=sc.nextInt();
			double h=sc.nextInt();
			double area;
			area=(b/h)/2;
			System.out.println("Area Of Triangle is :"+area);
        }
        void areaOfCircle()
        {
        	System.out.println("Enter the Radius Of circle");
        	double radius=sc.nextInt();
        	double area;
        	area = 3.14 * radius * radius;
        	System.out.println("Area Of circle :"+area);
        }
        void areaOfSquare()
        {
        	System.out.println("enter the side of Square");
        	double side=sc.nextInt();
			double area;
			area=side*side;
			System.out.println("Area Of Square is :"+area);
        }

}
