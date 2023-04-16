package arraysInJava;
import java.util.Scanner;
public class ArrayOperation {
	
	void addArrayElements(int a[])
	{
		int sum=0;  // Advance for loop/for each loop 
		for(int i:a) // elements of array
		{
			sum=sum+i;
		}
		System.out.print("Addition of sum :"+sum);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		System.out.println("Enter array Elements");
		
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayOperation obj=new ArrayOperation();
		obj.addArrayElements(arr);
	}
	
}
