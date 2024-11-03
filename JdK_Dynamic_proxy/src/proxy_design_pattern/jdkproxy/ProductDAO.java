package proxy_design_pattern.jdkproxy;

public interface ProductDAO {
	
	public Product getProductById(int id);
	
	public void saveProduct(Product product);
	
	
	public String updateProduct(Product product);

}
