package proxy_design_pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EmployeeSalaryInvocationHandler implements InvocationHandler{

	
	private Iemployee iemployeeTarget;
	
	public EmployeeSalaryInvocationHandler(Iemployee iemployeeTarget) {
		
		this.iemployeeTarget = iemployeeTarget;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		//Pre processing 
		if(method.getName().equals("giveHike")) {
			double hikeValue = (double)args[0];
			if(hikeValue<=0.0) {
				throw new RuntimeException("hike amount is not valid");
			}	
		}
		
		
		//making actual call to my service layer
		 Object invoke = method.invoke(iemployeeTarget,args);
		
		//post processing
		System.out.println("Executing the method for giving "+method.getName()+"invoked");
		return invoke;
	}
	

}
