package forlooping;
import java.util.Scanner;
public class Table3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int c=sc.nextInt();
		for(int i=1 ; i<=10  ; ++i )
		{
			System.out.println(c+"*"+i+"="+c*i);
		}

	}

}
