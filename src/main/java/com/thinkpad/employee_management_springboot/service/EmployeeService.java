package com.thinkpad.employee_management_springboot.service;


import com.thinkpad.employee_management_springboot.model.Employee;

import java.util.Optional;

public interface EmployeeService {
    Iterable<Employee> findAll();

    Optional<Employee> findById(Integer id);

    void save(Employee employee);

    void remove(Employee employee);

    Iterable<Employee> search(String word);

}
