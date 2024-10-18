package com.completable.Future.business;

import com.completable.Future.entity.Employee;
import com.completable.Future.enums.EmployeeEnums;
import com.completable.Future.repository.EmployeeRepository;
import com.completable.Future.service.EmployeeService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

  private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

  private final EmployeeRepository employeeRepository;

  private final Map<EmployeeEnums, Employee> employeeImplementations;


  public EmployeeServiceImpl(EmployeeRepository employeeRepository,
      Map<EmployeeEnums, Employee> employeeImplementations) {
    this.employeeRepository = employeeRepository;
    this.employeeImplementations = employeeImplementations;
  }


  @Override
  public CompletableFuture<List<Employee>> saveEmployees(List<Employee> employees) {
    var startTimeMillis = System.currentTimeMillis();
    List<Employee> employeesAfterOperationsPerformed = new ArrayList<>();
    employees.forEach(employee -> {
      var employeeType = EmployeeEnums.findByValue(employee.getEmployeeType());
      var getEmployeeOperation = employeeImplementations.get(employeeType);

      employeesAfterOperationsPerformed.add(employee);
    });
    var endTimeMillis = System.currentTimeMillis();
    logger.info("Total time {}", (endTimeMillis - startTimeMillis));
    return CompletableFuture.completedFuture(employeesAfterOperationsPerformed);
  }

  @Override
  public CompletableFuture<List<Employee>> getEmployees() {
    return null;
  }
}
