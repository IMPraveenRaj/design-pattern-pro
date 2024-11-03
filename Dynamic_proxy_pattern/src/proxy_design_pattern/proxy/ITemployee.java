package proxy_design_pattern.proxy;

public class ITemployee implements Iemployee {

	private double salary;

	private int id;
	private String name;

	@Override
	public void giveHike(double amount) {
		//
		salary = this.salary + amount;
	}

	@Override
	public void payCut(double amount) {
		// TODO Auto-generated method stub
		salary = this.salary - amount;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setId(int id) {
		this.id = id;

	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;

	}

	@Override
	public void setSalary(double amount) {
		// TODO Auto-generated method stub
		this.salary=amount;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return this.salary;
	}

}
