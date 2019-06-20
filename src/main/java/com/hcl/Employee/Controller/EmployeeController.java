package com.hcl.Employee.Controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.Employee.Model.Employee;
import com.hcl.Employee.Service.EmployeeService;

@RestController
public class EmployeeController {

	private static Logger logger = Logger.getLogger(EmployeeController.class.getName());

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/createEmployee")
	public Employee createEmployee(Employee employee) {
		logger.info("inside CreateEmployee Controller");
		return employeeService.addEmployee(employee);

	}
	
	@GetMapping("/getEmployeeById/{employeeId}")
	public Employee getEmployeeById(@PathVariable Long employeeId) {
		logger.info("inside getByEmployeeId Method");
		return employeeService.getEmployeeById(employeeId);
	}
	
	@GetMapping("/getAllEmployeeList")
	public List<Employee> getEmployeeList()
	{
		return  employeeService.getEmployeeList();
		
	}

}
