package whilelooping;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=11,c=2; //  2 to 10
		int mid=num/2;
		
		boolean flag=true;
		
		while(c<num-1)
		{
			if(num%c==0)
			{	
				//System.out.println("not a prime number");
				flag=false;
			   
			    break;
			}
			c++;
		}
		if(flag==true)
			System.out.println("prime number");
		else
		    System.out.println("not prime");
         
		/*while(c<=mid)     //  c=2    c=3    c=4
		{
			if(num%c==0)   //    f     f       f
			{
				System.out.println("not a prime number");
				break;
			}
			c++;          //   c=3    c=4   c=5
		
		if(c>mid)
			System.out.println("prime number"); */
	}

}
