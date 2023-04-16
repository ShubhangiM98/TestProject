package forlooping;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		System.out.println(a+ "" +b+"");
		for(int i=2;i<9;i++)
		{
			 int c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		
		}
       /* for(int i=1;i<=9;i++) //  i=1      i=2
        {
        	int c=a+b; //        c=0+1=1   c=1+1=2
        	System.out.println(a+"");//0      1
        	a=b;//                  a=1      a=1     
        	b=c;//                  b=1
        	
        }*/
	} 

}
