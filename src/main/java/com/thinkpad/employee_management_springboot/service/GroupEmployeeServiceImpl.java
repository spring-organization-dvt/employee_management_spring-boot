package com.thinkpad.employee_management_springboot.service;


import com.thinkpad.employee_management_springboot.model.GroupEmployee;
import com.thinkpad.employee_management_springboot.repository.GroupEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class GroupEmployeeServiceImpl implements GroupEmployeeService{
        @Autowired
        private GroupEmployeeRepository groupEmployeeRepository;

        @Override
        public Iterable<GroupEmployee> findAll() {
            return groupEmployeeRepository.findAll();
        }

        @Override
        public Optional<GroupEmployee> findById(Integer id) {
                return groupEmployeeRepository.findById(id);
        }


        @Override
        public void save(GroupEmployee groupEmployee) {
                groupEmployeeRepository.save(groupEmployee);
        }

        @Override
        public void remove(GroupEmployee groupEmployee) {
                groupEmployeeRepository.delete(groupEmployee);
        }
}
