package com.completable.Future.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employee")
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
  @Id
  @GeneratedValue
  private Long id;
  private String firstName;
  private String lastName;
  private String email;
  private Double salary;
  private String employeeType;
  private Integer hoursWorked;
  private Double hourlyRate;

}
