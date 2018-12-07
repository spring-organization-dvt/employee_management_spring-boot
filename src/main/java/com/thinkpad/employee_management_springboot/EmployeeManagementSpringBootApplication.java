package com.thinkpad.employee_management_springboot;

import com.thinkpad.employee_management_springboot.service.EmployeeService;
import com.thinkpad.employee_management_springboot.service.EmployeeServiceImpl;
import com.thinkpad.employee_management_springboot.service.GroupEmployeeService;
import com.thinkpad.employee_management_springboot.service.GroupEmployeeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeManagementSpringBootApplication {

	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl();
	}

	@Bean
	public GroupEmployeeService groupEmployeeService() {
		return new GroupEmployeeServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSpringBootApplication.class, args);
	}
}
