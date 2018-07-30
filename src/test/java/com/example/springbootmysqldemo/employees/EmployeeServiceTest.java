package com.example.springbootmysqldemo.employees;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class EmployeeServiceTest {

  @Autowired
  EmployeeService service;

  @Test
  public void testForRead() {
    Employee kohli = service.findEmployeeByEmpNo("1001");
    assertEquals("Kohli", kohli.getEmpName());
  }
}
