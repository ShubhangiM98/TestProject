package test4;

public class ElectricCar extends Car{
	
     int batterylevel;
	
	ElectricCar(int speed,int batterylevel){
		super(speed);
		this.batterylevel=batterylevel;
	}
	void recharge(){
		batterylevel=100;
		System.out.println("Fully charged");
	}

	
}
