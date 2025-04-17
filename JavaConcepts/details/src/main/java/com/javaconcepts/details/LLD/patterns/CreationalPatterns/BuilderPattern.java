package com.javaconcepts.details.LLD.patterns.CreationalPatterns;

public class BuilderPattern {

  public static void main(String[] args) {
    Person person = new PersonBuilder()
        .name("prudhvi")
        .age(25)
        .address(new AddressBuilder()
            .street("line1").build())
        .build();
    System.out.println(person.getAge());
  }
}

class Person {

  private String name;
  private int age;
  private String phoneNumber;
  private String email;
  private Address address;

  public Person() {
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}

class Address {
  private String street;
  private String city;
  private String state;
  private String country;

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }
}

class PersonBuilder {
  private Person person;

  PersonBuilder() {
    this.person = new Person();
  }

  public PersonBuilder name(String name) {
    this.person.setName(name);
    return this;
  }

  public PersonBuilder age(int age) {
    this.person.setAge(age);
    return this;
  }

  public PersonBuilder phoneNumber(String phoneNumber) {
    this.person.setPhoneNumber(phoneNumber);
    return this;
  }

  public PersonBuilder address(Address address) {
    this.person.setAddress(address);
    return this;
  }

  public Person build() {
    return this.person;
  }

}

class AddressBuilder {
  private Address address;

  AddressBuilder() {
    this.address = new Address();
  }

  public AddressBuilder street(String street) {
    this.address.setStreet(street);
    return this;
  }

  public Address build() {
    return this.address;
  }
}

/**
 * Other way of creating the builder pattern.
 */
//class PersonNew {
//  private String name;
//  private int age;
//  private String phoneNumber;
//  private String email;
//  private Address address;
//
//  public PersonNew(PersonBuilderNew personBuilderNew) {
//    this.name = personBuilderNew.;
//  }
//
//  public String getName() {
//    return name;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }
//
//  public Address getAddress() {
//    return address;
//  }
//
//  public void setAddress(Address address) {
//    this.address = address;
//  }
//
//  public String getEmail() {
//    return email;
//  }
//
//  public void setEmail(String email) {
//    this.email = email;
//  }
//
//  public String getPhoneNumber() {
//    return phoneNumber;
//  }
//
//  public void setPhoneNumber(String phoneNumber) {
//    this.phoneNumber = phoneNumber;
//  }
//
//  public int getAge() {
//    return age;
//  }
//
//  public void setAge(int age) {
//    this.age = age;
//  }
//}
//class PersonBuilderNew {
//  private String name;
//  private int age;
//  private String phoneNumber;
//  private String email;
//  private Address address;
//
//  public PersonBuilderNew name(String name) {
//    this.name = name;
//    return this;
//  }
//
//  public Person build() {
//    return new Person(this);
//  }
//
//}