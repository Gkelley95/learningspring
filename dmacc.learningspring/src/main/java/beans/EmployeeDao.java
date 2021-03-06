package beans;

import java.util.List;

public interface EmployeeDao {

	public void insert(Employee employee);
	public void update(Employee employee);
	public void update(List<Employee>employees);
	public void delete(long accountId);
	public Employee find(long sourceEmployeeId);
	public List<Employee> find(String name);
	public List<Employee> find (boolean termination);
	
}
