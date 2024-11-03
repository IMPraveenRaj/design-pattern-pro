package proxy_design_pattern.proxy;

public interface ProductDAO {
	
	public Product getProductById(int id);
	
	public void saveProduct(Product product);

}
