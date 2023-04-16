package inheritance;

public class SamsungMobileMain {

	public static void main(String[] args) {

		Samsung s1 = new Samsung();
		s1.calling();
		s1.setStorage(128);
		s1.camera();
		s1.messaging();
		s1.setPrice(30000);
		s1.cameraResolution();

		System.out.println(s1.getStorage());
		System.out.println(s1.getPrice());

	}

}
