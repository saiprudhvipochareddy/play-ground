package com.completable.Future.service;

import com.completable.Future.entity.Employee;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface EmployeeService {
  CompletableFuture<List<Employee>> saveEmployees(List<Employee> employee);

  CompletableFuture<List<Employee>> getEmployees();

}
