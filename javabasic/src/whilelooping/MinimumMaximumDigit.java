package whilelooping;

public class MinimumMaximumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=71562;
		int max=num%10,min=num%10; //2
		
		while(num!=0)//     num=71562  num=7156   num=715  num=71  num=7
		{
			int r=num%10;//  r=2       r=6       r=5       r=1     r=7
			if(r>max)//                t                            t
			{
				max=r;//             max=6                       max=7
			}
			if(r<min)//                                    t
			{
				min=r;//                                  min=1
			}
			num=num/10;// num=7156  num=715    num=71    num=7   num=0
		}
		System.out.println("Minimum digit "+min);
		System.out.println("Maximum digit "+max);

	}

}
