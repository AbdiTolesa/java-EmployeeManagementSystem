
package com.example.employeemanagerbackend;

import org.springframework.data.repository.CrudRepository;

import com.example.employeemanagerbackend.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}