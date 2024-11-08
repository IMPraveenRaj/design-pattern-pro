package proxy_design_pattern.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException {

		/*
		 * Class<?> studentInfo = Class.forName("proxy_design_pattern.proxy.Student");
		 * Constructor<?>[] constructors = studentInfo.getConstructors();
		 * 
		 * for (Constructor constructor : constructors) {
		 * System.out.println(constructor); }
		 */
		/*
		 * Method[] declaredMethods = studentInfo.getDeclaredMethods(); for(Method
		 * method : declaredMethods) { System.out.println(method); }
		 */
		 
		//Class<?> studentInfo = Class.forName("proxy_design_pattern.proxy.Student");
		var info = Student.class;
		Student student = (Student) info.newInstance();
		Method declaredMethods2 = info.getDeclaredMethod("attendLesson", null);
		declaredMethods2.invoke(student, null);
		/*
		 * for(Method method : declaredMethods2) { System.out.println(method);
		 * method.invoke(declaredMethods2, args)
		 * 
		 * }
		 */
	}
}
