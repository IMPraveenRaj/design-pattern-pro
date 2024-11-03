package proxy_design_pattern.proxy;

public class App {

	
	
	public static void main(String args[]) {
		
		/*
		 * ProductDAO productDAO= new ProductDAOImpl(); productDAO.getProductById(1);
		 * productDAO.saveProduct(new Product());
		 */
		
		 ProductDAOImplProxy productDaoProxy= new ProductDAOImplProxy(new ProductDAOImpl());
		 productDaoProxy.getProductById(1);
		 productDaoProxy.saveProduct(new Product());
		
	}
}