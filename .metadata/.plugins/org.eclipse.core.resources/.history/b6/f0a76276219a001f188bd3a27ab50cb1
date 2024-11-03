package proxy_design_pattern.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProductDAOInvocationHandler implements InvocationHandler{

	ProductDAOImpl productDAOImplTarget;
	
	public ProductDAOInvocationHandler(ProductDAOImpl productDAOImplTarget) {
		this.productDAOImplTarget=productDAOImplTarget;
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
	
		
		new DbConnectionUtils().ConnectToDB();
		
		Object returnType = method.invoke(productDAOImplTarget, args);
		new DbConnectionUtils().closeConnectionToDB();
		
		return returnType;
	}

}
