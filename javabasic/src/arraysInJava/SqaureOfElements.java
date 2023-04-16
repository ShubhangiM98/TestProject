package arraysInJava;

import java.util.Scanner;

public class SqaureOfElements {

	void displaySqauareOfElements(int arr[]) {
		for (int i : arr) {
			int square = i * i;
			System.out.print(square+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the array Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		SqaureOfElements obj = new SqaureOfElements();
		obj.displaySqauareOfElements(arr);
	}

}
