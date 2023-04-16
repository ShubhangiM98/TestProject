package arraysInJava;

public class ArrayExample1 {
	void arraylength(int arr[]) {
		System.out.println("length of array is :" + arr.length);
	}

	void displayElements(int ar[]) {
		for (int i = 0; i < ar.length; i++) {

			System.out.print(ar[i]+" ");
		}
	}

	void printEvenElements(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0)
				System.out.print(ar[i] + " ");
		}
	}

	void printEvenIndexElements(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0)
				System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 10, 21, 30, 40, 41, 60 };
		ArrayExample1 obj = new ArrayExample1();
		obj.arraylength(arr);
		obj.displayElements(arr);
		System.out.println();
		obj.printEvenElements(arr);
		System.out.println();
		obj.printEvenIndexElements(arr);

	}

}
