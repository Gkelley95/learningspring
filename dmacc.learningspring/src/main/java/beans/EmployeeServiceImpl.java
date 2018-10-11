package beans;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao employeeDao;
	
	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void changePayRate(long employeeId, double amount){
		Employee employee = employeeDao.find(employeeId);	
		employee.setPayrate(employee.getPayrate() + amount);		
		employeeDao.update(employee);		
	}
	
	public void terminate(long employeeId) {
		Employee employee = employeeDao.find(employeeId);
		employee.setTerminated(true);
		employeeDao.update(employee);
	}
	
	public void rehire(long employeeId) {
		Employee employee = employeeDao.find(employeeId);
		employee.setTerminated(false);
		employeeDao.update(employee);
	}
	
	public Employee getEmployee(long employeeId) {
		return employeeDao.find(employeeId);
	}
	
	
	
	
	
	
	
}
