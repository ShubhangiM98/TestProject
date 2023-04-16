package whilelooping;

public class DigitAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=543,sum=0;
		
		while(num>0)      //num=543          num=54       num=5          num=0
		{                   //                                            f                                              
			int r=num%10; //r=543%10=3       r=54%10=4    r=5%10=5
			sum=sum+r;    //sum=0+3=3      sum=3+4=7      sum=7+5=12
			num=num/10;  //num=543/10=54   num=54/10=5    num=5/10=0
		}
		System.out.println("Addition is :"+sum);

	}

}
