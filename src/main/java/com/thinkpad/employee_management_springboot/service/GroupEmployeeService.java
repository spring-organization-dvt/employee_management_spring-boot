package com.thinkpad.employee_management_springboot.service;


import com.thinkpad.employee_management_springboot.model.GroupEmployee;

import java.util.Optional;

public interface GroupEmployeeService {
    Iterable<GroupEmployee> findAll();
    Optional<GroupEmployee> findById(Integer id);

    void save(GroupEmployee groupEmployee);

    void remove(GroupEmployee groupEmployee);
}
