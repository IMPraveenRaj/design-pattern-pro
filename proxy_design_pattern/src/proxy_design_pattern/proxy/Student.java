package proxy_design_pattern.proxy;

public class Student implements DailySession
{

	
	
	
	
	public Student() {
		super();
	}



	public Attendance getAttendance() {
		return attendance;
	}



	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
	}



	private Attendance attendance;
	
	
	
	public Student(Attendance attendance) {		
		this.attendance = attendance;
	}


	
	public void attendLesson() {
		System.out.println("i am invoked");
	}

	@Override
	public void attendSession() {
		// TODO Auto-generated method stub	
		System.out.println("attending the session");	
	}
}
