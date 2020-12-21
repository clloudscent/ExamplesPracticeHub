package 실습.chap02.inheritance;

public class Boeing787 extends Boeing737 {
	
	public Boeing787() {
		super(800, "Long-Range");
	}
	
	public Boeing787(int speed, String type) {
		super(speed, type);
	}
	
	@Override
	public String Range() {
		return "5000";
	}
	@Override
	public String RPM() {
		return "10000";
	}
	
	
}
