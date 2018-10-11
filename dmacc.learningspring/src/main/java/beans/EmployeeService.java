package beans;

public interface EmployeeService {

	public void changePayRate(long employeeId, double amount);
	public void terminate(long employeeId);
	public void rehire(long employeeId);
	public Employee getEmployee(long employeeId);
	
}
