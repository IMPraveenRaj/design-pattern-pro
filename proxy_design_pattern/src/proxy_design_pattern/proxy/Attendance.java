package proxy_design_pattern.proxy;

import java.util.Date;

public class Attendance {
	
	private Date date;
	
	private Boolean isPresent;

	public Attendance(Date date, Boolean isPresent) {		
		this.date = date;
		this.isPresent = isPresent;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getIsPresent() {
		return isPresent;
	}

	public void setIsPresent(Boolean isPresent) {
		this.isPresent = isPresent;
	}
	
	

}
