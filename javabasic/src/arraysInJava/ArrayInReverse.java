package arraysInJava;
import java.util.Scanner;
public class ArrayInReverse {
	
	void arrayInReverse(int arr[]){
		for(int i=arr.length-1;i>0;i--){
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		ArrayInReverse obj=new ArrayInReverse();
		obj.arrayInReverse(arr);
	}
}
