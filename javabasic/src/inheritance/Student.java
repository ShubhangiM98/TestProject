package inheritance;

public class Student extends Person {

	int sid;
	float percent;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	void display() {
		System.out.println(sid + " " + name + " " + contact + " " + percent
				+ " " + address);
	}

	void grade() {
		if (percent >= 70) {
			System.out.println("Destinction");
		} else if (percent >= 60) {
			System.out.println("first class");
		} else if (percent >= 50) {
			System.out.println("second class");
		} else if (percent >= 35) {
			System.out.println("pass class");
		} else {
			System.out.println("fail");
		}
	}

}
