package com.completable.Future.common;

public class CustomRunTimeException extends RuntimeException {

  private String message;

  public CustomRunTimeException(String message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return message;
  }
}
