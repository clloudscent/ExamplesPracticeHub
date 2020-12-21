package 실습.chap02.inheritance;

public class Boeing737 {
	
	public int speed;
	public String type;
	
	public Boeing737 () {
		this.speed = 500;
		this.type = "Short-range";
		
	}
	
	public Boeing737 (int speed, String type) {
		this.speed = speed;
		this.type = type;
	}
	
	public String Range() {
		return "3000";
	}
	
	public String RPM() {
		return "6000";
	}

}
