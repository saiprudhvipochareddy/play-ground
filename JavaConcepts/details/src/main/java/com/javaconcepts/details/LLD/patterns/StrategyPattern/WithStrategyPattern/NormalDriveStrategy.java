package com.javaconcepts.details.LLD.patterns.StrategyPattern.WithStrategyPattern;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal drive capability");
    }
}
