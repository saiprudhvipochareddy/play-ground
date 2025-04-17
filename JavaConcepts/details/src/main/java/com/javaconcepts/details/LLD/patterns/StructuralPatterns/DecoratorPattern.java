package com.javaconcepts.details.LLD.patterns.StructuralPatterns;

public class DecoratorPattern {

  public static void main(String[] args) {
    Burger baseBurger = new BaseBurger();
    System.out.println("Name of burger: " + baseBurger.getName());
    System.out.println("cost of burger: " + baseBurger.getPrice());
    Burger cheeseBurger = new Cheese(baseBurger);
    System.out.println("Name of burger: " + cheeseBurger.getName());
    System.out.println("cost of burger: " + cheeseBurger.getPrice());
    Burger tomato = new Tomato(baseBurger);
    System.out.println("Name of burger: " + tomato.getName());
    System.out.println("cost of burger: " + tomato.getPrice());
  }
}

interface Burger {
  String getName();
  Double getPrice();
}

class BaseBurger implements Burger {

  @Override
  public String getName() {
    return "Base Burger";
  }

  @Override
  public Double getPrice() {
    return 20.0;
  }
}

abstract class BurgerDecorator implements Burger {
  private Burger burger;

  public BurgerDecorator(Burger burger) {
    this.burger = burger;
  }

  @Override
  public String getName() {
    return burger.getName();
  }

  @Override
  public Double getPrice() {
    return burger.getPrice();
  }
}

class Cheese extends BurgerDecorator {

  public Cheese(Burger burger) {
    super(burger);
  }

  @Override
  public String getName() {
    return super.getName().concat(", cheese");
  }

  @Override
  public Double getPrice() {
    return super.getPrice() + 10.0;
  }
}

class Tomato extends  BurgerDecorator {
  public Tomato(Burger burger) {
    super(burger);
  }

  @Override
  public String getName() {
    return super.getName().concat(", tomato");
  }

  @Override
  public Double getPrice() {
    return super.getPrice() + 30.0;
  }

}
