package com.completable.Future.repository;

import com.completable.Future.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EmployeeRepository extends JpaRepository<Employee, Long>,
    JpaSpecificationExecutor<Employee> {

}
