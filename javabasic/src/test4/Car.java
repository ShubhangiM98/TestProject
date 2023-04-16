package test4;

public class Car {
	
	int speed;
	
	Car(int speed){
		this.speed=speed;
	}
	
	void accelerate(){
		speed+=10;
		System.out.println("Car Speed = "+speed+"mph");
	}

}
