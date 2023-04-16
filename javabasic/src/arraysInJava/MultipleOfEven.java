package arraysInJava;
import java.util.Scanner;
public class MultipleOfEven {
	
	void showMultiplyOfEven(int arr[]) {
		int product=1;
		for (int i : arr) {
			if(i%2==0){
				product=product*i;
			}
		}System.out.println("Product of even elements :"+product);
	}
	void arrayInReverse(int arr[]){
		for(int i=arr.length;i>0;i--){
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int[]arr=new int[size];
		System.out.println("Enter the array of elements");
		
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		MultipleOfEven obj=new MultipleOfEven();
		obj.showMultiplyOfEven(arr);
		obj.arrayInReverse(arr);
	
	}

}
