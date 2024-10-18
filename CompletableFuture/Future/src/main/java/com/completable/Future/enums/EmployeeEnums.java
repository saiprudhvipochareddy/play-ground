package com.completable.Future.enums;

public enum EmployeeEnums {
  CONTRACTOR_EMPLOYEE("CONTRACTOR"),
  SALARIED_EMPLOYEE("SALARIED");

  private final String value;

  EmployeeEnums(final String value) {
    this.value = value;
  }

  public static EmployeeEnums findByValue(String value) {
    for (EmployeeEnums enumValue : values()) {
      if (enumValue.value.equals(value)) {
        return enumValue;
      }
    }
    throw new IllegalArgumentException("No matching constant for value: " + value);
  }

  public String getValue() {
    return value;
  }

}
