package forlooping;

public class PatternAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int alphabet=97;         use either ascii value
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(""+(char)alphabet);
			}
			alphabet++;
			System.out.println();
		}*/
		
		for(char i='a';i<='e';i++)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(""+i);
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		for(char i='a';i<='e';i++)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(""+j);
			}
			System.out.println();
		}


	}

}
