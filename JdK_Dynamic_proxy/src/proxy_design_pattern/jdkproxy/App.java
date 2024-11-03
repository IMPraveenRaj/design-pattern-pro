package proxy_design_pattern.jdkproxy;

import java.lang.reflect.Proxy;

public class App {

	public static void main(String args[]) {

		/*
		 * ProductDAO productDAO= new ProductDAOImpl(); productDAO.getProductById(1);
		 * productDAO.saveProduct(new Product());
		 */

		ProductDAO productDao = (ProductDAO) Proxy.newProxyInstance(ProductDAO.class.getClassLoader(),
				new Class[] { ProductDAO.class }, new ProductDAOInvocationHandler(new ProductDAOImpl()));
		
		Product productById = productDao.getProductById(1);
		System.out.println(productById);
		productDao.saveProduct(new Product());
		String updateProduct = productDao.updateProduct(new Product());
		System.out.println(updateProduct);
	}
}
