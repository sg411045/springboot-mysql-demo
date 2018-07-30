package com.example.springbootmysqldemo.employees;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long> {
  Employee findByEmpNo(String empNo);
}
