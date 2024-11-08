package proxy_design_pattern.proxy;

import java.lang.reflect.Proxy;

public class Client {

	
	
	public static void main(String[] args) {
		ITemployee itemployee= new ITemployee();
		itemployee.setId(101);
		itemployee.setName("praveenraj");
		itemployee.setSalary(50000);
		//itemployee.giveHike(5000);
		EmployeeSalaryInvocationHandler empHandler= new EmployeeSalaryInvocationHandler(itemployee);
		
		
		Iemployee employee = (Iemployee)Proxy.newProxyInstance(ITemployee.class.getClassLoader(), new Class[] {
				Iemployee.class
		}, empHandler);
		employee.giveHike(-5000);
		System.out.println(employee.getSalary());
	}
}
