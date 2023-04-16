package forlooping;

public class BasicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int end=15,a=1;
		// 1 4 7 10 13 16 19 22 25...
		//  3 3 3
		
		for(int i=1;i<=15;i++)
		{
			System.out.println(a+"");
			a+=3;
		}
		System.out.println("\n");
		//1 4 9 16 25 36 49 64 81 100
		
		for(int i=1;i<=10;i++)
		{
			System.out.println((i*i)+"");
		}
		System.out.println("\n");
		//1 3 7 13 21 31 43
		// 2 4 6  8  10 12
		int c=1;
		for(int i=1;i<=7;i++)
		{
			System.out.println(""+c);
			c=c+(i*2);
		}
		System.out.println("\n");
		//1 5 14 30 55 91
		// 4 9  16 25 36
		// 2 3  4   5
		int s=1,b=2;
		for(int i=1;i<=6;i++)
		{
			System.out.println(""+s);
			s=s+(i+1)*(i+1);
			
		}
	}

}
