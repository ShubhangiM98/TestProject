package abstraction;

public class Swift extends Car{
	
	Swift()
	{
		super(700000,"red");
		System.out.println("In swift constructor");
	}
	
	@Override
	void dashBoard(){
		System.out.println("Swift : Ac,Music System,pan drive slot");
	}
	@Override
	void engineSpecification(){
		System.out.println("Swift Engine : 1200cc");
	}
	@Override
	void seatNo(){
		System.out.println("Swift : 4seater");
	}
	
	void airBag(){
		System.out.println("Airbags are available");
	}

}
