package inheritance;

public class Mobile {

	int storage;

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	void calling() {
		System.out.println("Basic calling feature");
	}

	void camera() {
		System.out.println("camera is must");
	}

	void messaging() {
		System.out.println("messaging available");
	}
}
