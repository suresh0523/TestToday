package com.hcl.Employee.Service;



import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hcl.Employee.Exception.ApplicationException;
import com.hcl.Employee.Model.Employee;
import com.hcl.Employee.Repository.EmployeeRepository;

import springfox.documentation.swagger2.mappers.ModelMapper;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	private static Logger logger = Logger.getLogger(EmployeeServiceImpl.class.getName());
	
	@Autowired
	EmployeeRepository employeeRepo;
	
	@Autowired
	ModelMapper modelMapper;

	@Override
	public Employee addEmployee(Employee employee) throws ApplicationException {
		
		if(employee.getEmployeeName()==null && employee.getEmployeeAddress() == null) {
			 logger.info("inside addEmployee method employee name is null");
			 throw new ApplicationException("Employee not created");
		}else {
			employee = employeeRepo.save(employee);
			 logger.info("inside addEmployee method");
			 
		}
		/*
		 * 
		 * if(employee == null) { throw new
		 * ApplicationException("Employee not created"); }
		 */
			return employee;
	
	}

	@Override
	public Employee getEmployeeById(Long employeeId) throws ApplicationException {
		
	Employee employee = employeeRepo.findByEmployeeId(employeeId);
		logger.info("inside account details method");
		logger.info(employee);
		
		if (employee == null) {
			throw new ApplicationException("Employee Details Not Found");
		}
		
		return employee;
	}

	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	
	
	


}
