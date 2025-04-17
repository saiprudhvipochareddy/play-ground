package com.javaconcepts.details.LLD.patterns.StrategyPattern.WithStrategyPattern;

import com.javaconcepts.details.LLD.patterns.StrategyPattern.withoutStrategyPattern.SportsVehicle;
import com.javaconcepts.details.LLD.patterns.StrategyPattern.withoutStrategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
    }
}
