package com.javaconcepts.details.LLD.patterns.StrategyPattern.WithStrategyPattern;

public class GoodsVehicle extends VehicleServiceImpl{
    public GoodsVehicle(NormalDriveStrategy normalDriveStrategy) {
        super(normalDriveStrategy);
    }
}
