package encapsulation;

public class Car {
	private int id,price,launchYear;
	private String name,company;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setPrice( int price)
	{
		this.price=price;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void setLaunchyear(int launchYear)
	{
		this.launchYear=launchYear;
	}
	
	public int getLaunchYear()
	{
		return launchYear;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setCompany(String company)
	{
		this.company=company;
	}
	public String getComapny()
	{
		return company;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
