package javabasic;

public class Assign1TotalAveragePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float eng=65,phy=72,chem=64,maths=89,bio=69,Total,Average,Percentage;
		Total=eng+phy+chem+maths+bio;
		Average=Total/5;
		Percentage=(Total/500)*100;
		System.out.println("Total :"+Total);
		System.out.println("Average :"+Average);
		System.out.println("Percentage :"+Percentage);

	}

}
