package com.javaconcepts.details.LLD.patterns.StrategyPattern.WithStrategyPattern;

public class OffRoadVehicle extends VehicleServiceImpl{
    public OffRoadVehicle(SportsDriveStrategy sportsDriveStrategy) {
        super(sportsDriveStrategy);
    }
}
