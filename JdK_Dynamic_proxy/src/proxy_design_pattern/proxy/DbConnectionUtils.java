package proxy_design_pattern.proxy;

public class DbConnectionUtils {
	
	public void ConnectToDB() {
		System.out.println("connecting to DB");
	}
	
	public void closeConnectionToDB() {
		System.out.println("close the connection to DB");
	}

}
