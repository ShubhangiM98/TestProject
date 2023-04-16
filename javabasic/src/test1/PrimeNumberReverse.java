package test1;

public class PrimeNumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100,count;
		for(int i=500;i>=num;i--)
		{
			count=0;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0){
				count++;
				break;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
