package sec02;

import java.util.Calendar;

public class CalendarExample1 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR);
		System.out.println(hour);
		
	}

}
