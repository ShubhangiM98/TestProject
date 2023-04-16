package inheritance;

public class Day extends Time {
	String day;

	void setDay(String day) {
		this.day = day;
	}

	void display() {
		System.out.println(day + " " + hrs + ":" + mins + ":" + secs + " " + dd
				+ "/" + mm + "/" + yy);
	}

}
