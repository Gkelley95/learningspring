package beans;

public class Employee {

	private long id;
	private String name;
	private double payrate;
	private boolean terminated;

	public Employee() {
	
	}
	
	public Employee(long id, String name, double payrate) {
		this.id = id;
		this.name = name;
		this.payrate = payrate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPayrate() {
		return payrate;
	}

	public void setPayrate(double payrate) {
		this.payrate = payrate;
	}

	public boolean isTerminated() {
		return terminated;
	}

	public void setTerminated(boolean terminated) {
		this.terminated = terminated;
	}
	
	
	
	
	
}