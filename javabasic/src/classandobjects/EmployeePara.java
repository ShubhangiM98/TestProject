package classandobjects;

public class EmployeePara {

	int id;
	String name,dept,contact;
	double salary;

	void Setdata(int i,String n,String d,String c,double s)
	{
		id=i;
		name=n;
		dept=d;
		contact=c;
		salary=s;
				
	}
	void display()
	{
		System.out.println(id+" "+dept+" "+contact+" "+salary);
	}

	}


