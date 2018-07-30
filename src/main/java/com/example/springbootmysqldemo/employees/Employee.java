package com.example.springbootmysqldemo.employees;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

  @Id
  @GeneratedValue
  private Long id;

  @Column(unique = true)
  private String empNo;

  private String empName;
  private String department;

  public Employee() {
  }

  public Employee(String empNo, String empName, String department) {
    this.empNo = empNo;
    this.empName = empName;
    this.department = department;
  }

  public String getEmpNo() {
    return empNo;
  }

  public void setEmpNo(String empNo) {
    this.empNo = empNo;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", empNo='" + empNo + '\'' +
        ", empName='" + empName + '\'' +
        ", department='" + department + '\'' +
        '}';
  }
}
