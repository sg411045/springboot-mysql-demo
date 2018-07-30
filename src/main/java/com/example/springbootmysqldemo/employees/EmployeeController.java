package com.example.springbootmysqldemo.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

  private final EmployeeService service;

  public EmployeeController(EmployeeService service) {
    this.service = service;
  }

  @GetMapping("/employee/{empNo}")
  @ResponseBody
  public Employee fetchEmployee(@PathVariable String empNo) {
    return service.findEmployeeByEmpNo(empNo);
  }
}
