package proxy_design_pattern.proxy;

public interface Iemployee {

	public void giveHike(double amount);

	public void payCut(double amount);

	public int getId();

	public void setId(int id);

	public String getName();

	public void setName(String name);
	
	public void setSalary(double amount);
	
	public double getSalary();

}