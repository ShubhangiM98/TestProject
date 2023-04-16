package test3;

public class Overload {

	public void compare(int a,int b){
		if(a>b){ 
			System.out.println("Greater no is "+a);
		}else{
			System.out.println("Greater no is "+b);
		}
	}
		 public void compare(char char1, char char2) {
		     
		        if (char1>char2) {
		            System.out.println( "  higher numeric value " + char1);
		        } else   {
		            System.out.println( " higher numeric value  " + char2);
		        }
		    }
		
	

	public static void main(String[] args) {
		Overload comp = new Overload();
		comp.compare(5, 7);

	}

}
