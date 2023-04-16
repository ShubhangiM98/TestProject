package forlooping;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=4;
		for(int i=1;i<=r;i++) //       i=1           i=2        i=3         i=4     i=5
		{//                           3             4-2=2      4-3=1      4-4=0
			for(int k=1;k<=r-i;k++)//k=1,2,3,4     k=1,2,3     k=1,2      k=1
			{
				System.out.print(" ");//_for space
			}
			for(int j=1;j<=i;j++)//     j=1,2       j=1,2,3    j=1,2,3,4
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		for(int i=1;i<=r;i++)
		{
			for(int k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		

	}

}
