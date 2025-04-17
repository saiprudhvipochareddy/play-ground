package com.completable.Future.config;

import com.completable.Future.business.AbstractEmployeeOperations;
import com.completable.Future.business.ContractorEmployeeOperationsImpl;
import com.completable.Future.business.SalariedEmployeeOperationsImpl;
import com.completable.Future.enums.EmployeeEnums;
import java.util.Map;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

  @Bean
  public Map<EmployeeEnums, Object> EmployeeConfig() {
    return Map.ofEntries(
        Map.entry(EmployeeEnums.CONTRACTOR_EMPLOYEE,
            new ContractorEmployeeOperationsImpl()),
        Map.entry(EmployeeEnums.SALARIED_EMPLOYEE,
            new SalariedEmployeeOperationsImpl())
    );
  }

}
