package encapsulation;

public class Faculty {
	private int id,salary;
	private String name,contact,subject;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	
	public int getsalary()
	{
		return salary;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setcontact(String contact)
	{
		this.contact=contact;
	}
	
	public String getContact()
	{
		return contact;
	}
	
	public void setSubject(String subject)
	{
		this.subject=subject;
	}
	
	public String getSubject()
	{
		return subject;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
