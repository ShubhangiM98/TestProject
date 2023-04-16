package inheritance;

public class Samsung extends Mobile {

	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void cameraResolution() {
		System.out.println("All samsung camera should be more than 12MP");
	}

}
