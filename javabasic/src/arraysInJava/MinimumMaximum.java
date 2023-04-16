package arraysInJava;

public class MinimumMaximum {
	
	void arrayMinMax(int arr[]){
		int min=arr[0],max=arr[0];
		for(int i:arr)
		{
			if (i>max)
			{
				max=i;
			}
			if(i<min)
			{
				min=i;
			}
		}
		System.out.println("Minimum no is : "+min);
		System.out.println("Minimum no is : "+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]={10,2,45,74,86,1,9,4,13,15};
		
		MinimumMaximum obj=new MinimumMaximum();
		obj.arrayMinMax(arr);

	}

}
