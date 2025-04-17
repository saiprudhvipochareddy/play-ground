package com.completable.Future.controller;

import com.completable.Future.entity.Employee;
import com.completable.Future.service.EmployeeService;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

  private final EmployeeService employeeService;

  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }

  @PostMapping
  public CompletableFuture<ResponseEntity<List<Employee>>> saveEmployees(@RequestBody List<Employee> employee){
    return employeeService.saveEmployees(employee).thenApply(ResponseEntity::ok);
  }

  @GetMapping
  public CompletableFuture<ResponseEntity<List<Employee>>> getEmployees() {
    return  employeeService.getEmployees().thenApply(ResponseEntity::ok);
  }

}
