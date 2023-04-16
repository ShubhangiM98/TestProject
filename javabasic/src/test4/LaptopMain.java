
package test4;

public class LaptopMain {

	public static void main(String[] args) {

		Laptop obj = new Laptop();

		obj.setNoOfUSBPort(3);
		obj.setProcessorSpeed(2);

		System.out.println("Number of USB Port =" + obj.getNoOfUSBPort()
				+ "\nProcessor Speed =" + obj.getProcessorSpeed() + "GHz");

	}

}
