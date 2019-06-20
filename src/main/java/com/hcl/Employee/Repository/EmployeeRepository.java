package com.hcl.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.hcl.Employee.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//	@Query("select * from employeedb.employee where employee_id=?")
	public Employee findByEmployeeId(Long employeeId);
}
