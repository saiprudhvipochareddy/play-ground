package com.completable.Future.business;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SalariedEmployeeOperationsImpl extends AbstractEmployeeOperations {

  @Override
  public double calculateHourlyRate() {
    return 0;
  }

  @Override
  public int calculateHoursWorked() {
    return 0;
  }

  @Override
  public double calculateSalary() {
    return 0;
  }
}
