package javabasic;

public class TypeCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float f=10; //implicate typecast
        System.out.println(f);
       
        int a;
        a=(int)4.9;  // explicit typecast
        System.out.println(a);
       
        char ch='1'; //ascii a=97,b=98,c=99...A=48,B=49..0-48,1-49,2-50
        int b=ch; //ascii value 
        System.out.println(+b);
        
        int x=101;
        char c=(char)x;
        System.out.println(+c);
	}

}
