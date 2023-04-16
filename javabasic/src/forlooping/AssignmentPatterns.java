package forlooping;

public class AssignmentPatterns {

	public static void main(String[] args) {
		
		//Number Pattern assignment
			for(int i=1;i<=5-1;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(""+j);
				}
				System.out.println();
			}
			
			for(int i=5;i>=1;i--)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(""+j);
				}
				System.out.println();
			}
			System.out.println("-----------------------------");
			
			for(int i=1;i<=5-1;i++)
			{
				for(int j=1;j<=(i*2-1);j++)
				{
					System.out.print(""+j);
				}
				System.out.println();
			}
			for(int i=5;i>=1;i--)
			{
				for(int j=1;j<=(i*2-1);j++)
				{
					System.out.print(""+j);
				}
				System.out.println();
			}
			System.out.println("-----------------------------");
		
			int r=5;
			for(int i=1;i<=5;i++)
			{
				
				for(int j=1;j<=i;j++)
				{
					System.out.print(j);
				}
				for(int k=i-1;k>=1;k--)
				{
					System.out.print(k);
				}
				System.out.println();
			}
			
			for(int i=r-1;i>=1;i--)
			{
				
				for(int j=1;j<=i;j++)
				{
					System.out.print(j);
				}
				for(int k=i-1;k>=1;k--)
				{
					System.out.print(k);
				}
				System.out.println();
			}
			System.out.println("-----------------------------");
			
			

	}

}
