package com.codeprophet.EmployeeDirectory.repository;

import com.codeprophet.EmployeeDirectory.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
