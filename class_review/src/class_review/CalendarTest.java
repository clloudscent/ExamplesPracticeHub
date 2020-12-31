package class_review;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("연도:" + cal.get(Calendar.YEAR));
		System.out.println("월:" + (cal.get(Calendar.MONTH)+1));
		System.out.println("일:" + cal.get(Calendar.DATE));
	}

}
