package com.thinkpad.employee_management_springboot.repository;


import com.thinkpad.employee_management_springboot.model.GroupEmployee;
import org.springframework.data.repository.CrudRepository;

public interface GroupEmployeeRepository extends CrudRepository<GroupEmployee,Integer> {
}
