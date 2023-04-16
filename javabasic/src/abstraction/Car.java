package abstraction;

public abstract class Car {//cannot create object of abstract class
	
	int price;
	String colour;
	
	Car(int price,String colour){
		this.price=price;
		this.colour=colour;
	}
	void display(){ //concrete method
		System.out.println(colour+" "+price);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	void wheelNo()
	{
		System.out.println("car will have 4 wheels");
	}
	void mirror(){
		System.out.println("3mirror,left,right,center(back view mirror)");
	}
	
	abstract void dashBoard();
	abstract void engineSpecification();
	abstract void seatNo();

}
