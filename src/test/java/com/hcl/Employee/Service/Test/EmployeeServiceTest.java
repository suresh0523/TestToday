package com.hcl.Employee.Service.Test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.hcl.Employee.Model.Employee;
import com.hcl.Employee.Repository.EmployeeRepository;
import com.hcl.Employee.Service.EmployeeServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {
	
	@Mock
	EmployeeRepository employeeRepo;
	
	@InjectMocks
	EmployeeServiceImpl employeeService;

	@Test
	public void addEmployee()
	{
		Employee employee1 = new Employee(56L,"desdfx","dxdfdf","cfdfg",45L,"fcf");
		Mockito.when(employeeRepo.save(employee1)).thenReturn(employee1);
		//Mockito.when(userProfilesIDao.save(userProfile)).thenReturn(userProfile);
		Employee actualVal=employeeService.addEmployee(employee1);
		Assert.assertEquals(employee1, actualVal);
	}
	
	@Test
	public void findByEmployeeId()
	{
		long id=1;
		Employee employee = new Employee();
		Mockito.when(employeeRepo.findByEmployeeId(id)).thenReturn(employee);
		Employee actval = employeeService.getEmployeeById(id);
		Assert.assertEquals(employee, actval);
		
	}
	
	
	
	
	

}
