package com.thinkpad.employee_management_springboot.repository;


import com.thinkpad.employee_management_springboot.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    Iterable<Employee> findByNameContaining(String word);
}
