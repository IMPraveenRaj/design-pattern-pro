package proxy_design_pattern.proxy;

import java.util.Date;

public class Teacher {

	
	
	public static void main(String[] args) {
		
		DailySession student = new StudentProxy(new Attendance(new Date(), true));
		student.attendSession();
		
	}
}