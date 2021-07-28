package com.pack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pack.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
 
	@Query("select a.name,b.city from Employee a,Address b where a.employeeAddress=b.addressId"
		+ " and a.employeeAddress=1")
	
	List<Object[]> find();
	 
}
