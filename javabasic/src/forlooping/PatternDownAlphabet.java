package forlooping;

public class PatternDownAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(char i='e';i>='a';i--)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(""+i);
			}
			System.out.println();
		}

	}

}
