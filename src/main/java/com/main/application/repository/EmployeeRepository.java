package com.main.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.application.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
