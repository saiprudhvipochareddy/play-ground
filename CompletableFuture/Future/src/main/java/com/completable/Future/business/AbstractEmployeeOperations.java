package com.completable.Future.business;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public abstract class AbstractEmployeeOperations {

  public abstract double calculateHourlyRate();

  public abstract int calculateHoursWorked();

  public abstract double calculateSalary();


}
