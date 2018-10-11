package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {
	
	public static void main(String[] args) {

	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
	
	EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);

	System.out.println("Current Pay Rate:");
	System.out.println("Employee " + employeeService.getEmployee(1).getName() + ": " + employeeService.getEmployee(1).getPayrate());

	employeeService.changePayRate(1, 1.00);
	
	System.out.println("After Pay Raise:");
	System.out.println("Employee " + employeeService.getEmployee(1).getName() + ": " + employeeService.getEmployee(1).getPayrate());



	}
}
