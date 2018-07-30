package com.example.springbootmysqldemo.employees;

import org.springframework.stereotype.Component;


@Component
public class EmployeeService {
  EmployeeRepository employeeRepository;

  public EmployeeService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }

  public Employee findEmployeeByEmpNo(String empNo) {
    return employeeRepository.findByEmpNo(empNo);
  }
}
