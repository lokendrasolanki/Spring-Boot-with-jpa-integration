package com.loki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loki.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
