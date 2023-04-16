package classandobjects;

public class Car {

	int id;
	String name,company;
	float price, launchyear;
	
	void setCarData(int id,String name,String company,float price,float launchyear)
	{
		this.id=id;
		this.name=name;
		this.company=company;
		this.price=price;
		this.launchyear=launchyear;
		
		this.display();
	}
	
	void display()
	{
		System.out.println(id+ " " + name+ " "+company+ " "+price+ " "+launchyear);
	}

}
