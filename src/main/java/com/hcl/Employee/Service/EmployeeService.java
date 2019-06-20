package com.hcl.Employee.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.Employee.Exception.ApplicationException;
import com.hcl.Employee.Model.Employee;
@Service
public interface EmployeeService {

	public Employee addEmployee(Employee employee) throws ApplicationException;
	
	public Employee getEmployeeById(Long employeeId) throws ApplicationException;
	
	public List<Employee> getEmployeeList();
}
