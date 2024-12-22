package com.javaconcepts.details.LLD.StrategyPattern.WithStrategyPattern;

public class VehicleServiceImpl {
    private final DriveStrategy driveStrategy;

    public VehicleServiceImpl(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
