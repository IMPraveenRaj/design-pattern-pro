package proxy_design_pattern.proxy;

/*
 * we are creating a proxy for the student object instead of creating a real object 
 * we are  creating a proxy for the student object it provides an object that acts a substitute for the
 * a real service object used by a client . A Proxy receives client request ,does some work and then passes 
 * the request to a original object 
*/

public class StudentProxy extends Student {

	public StudentProxy(Attendance attendance) {
		super(attendance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attendSession() {
		// TODO Auto-generated method stub

		/*
		 * if(super.getAttendance().getIsPresent()) { super.attendSession(); }else {
		 * throw new
		 * RuntimeException("student is not present can't attend the session "); }
		 */
		if (!super.getAttendance().getIsPresent()) {
			throw new RuntimeException("student is not present can't attend the session ");
		}
		super.attendSession();

	}

}
