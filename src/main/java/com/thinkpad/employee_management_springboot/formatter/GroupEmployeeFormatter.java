package com.thinkpad.employee_management_springboot.formatter;


import com.thinkpad.employee_management_springboot.model.GroupEmployee;
import com.thinkpad.employee_management_springboot.service.GroupEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;

@Component
public class GroupEmployeeFormatter implements Formatter<Optional<GroupEmployee>> {
    private GroupEmployeeService groupEmployeeService;

    @Autowired
    public GroupEmployeeFormatter(GroupEmployeeService groupEmployeeService) {
        this.groupEmployeeService = groupEmployeeService;
    }


    @Override
    public Optional<GroupEmployee> parse(String text, Locale locale) throws ParseException {
        return groupEmployeeService.findById(Integer.parseInt(text));
    }

    @Override
    public String print(Optional<GroupEmployee> object, Locale locale) {
        return "[" + object.get().getId() + ", " + object.get().getName() + "]";

    }
}
