package arraysInJava;

public class Array2 {
	void displayMultipleOf3(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0)
				System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 15 };
		Array2 obj = new Array2();
		obj.displayMultipleOf3(arr);

	}

}
