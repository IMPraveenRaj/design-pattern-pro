package proxy_design_pattern.jdkproxy;

public class ProductDAOImpl implements ProductDAO {

	DbConnectionUtils connectionUtils= new DbConnectionUtils();
	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		
		
		//connectionUtils.ConnectToDB();
		System.out.println("fetching product for id: "+id);
	//	connectionUtils.closeConnectionToDB();
		return new Product();
	}

	@Override
	public void saveProduct(Product product) {
		//connectionUtils.ConnectToDB();
		System.out.println("saving the product to db");
		//connectionUtils.closeConnectionToDB();
	}

	
	@Override
	public String updateProduct(Product product) {
		// TODO Auto-generated method stub
	System.out.println("product updated");
	return "product updated succesfully";
	}
}
