package proxy_design_pattern.proxy;

public class ProductDAOImplProxy implements ProductDAO {

	ProductDAOImpl delegate;
	
	public ProductDAOImplProxy(ProductDAOImpl prodDaoImpl) {
		// TODO Auto-generated constructor stub
		this.delegate=prodDaoImpl;
	}
	
	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		new DbConnectionUtils().ConnectToDB();
		Product product= delegate.getProductById(id);
		new DbConnectionUtils().closeConnectionToDB();
		return product;
	}

	@Override
	public void saveProduct(Product product) {
		// TODO Auto-generated method stub
		new DbConnectionUtils().ConnectToDB();
		delegate.saveProduct(product);
		new DbConnectionUtils().closeConnectionToDB();
	}


}
