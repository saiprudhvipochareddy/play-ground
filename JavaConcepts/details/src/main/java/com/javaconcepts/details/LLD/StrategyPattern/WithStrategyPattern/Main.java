package com.javaconcepts.details.LLD.StrategyPattern.WithStrategyPattern;

import com.javaconcepts.details.LLD.StrategyPattern.withoutStrategyPattern.SportsVehicle;
import com.javaconcepts.details.LLD.StrategyPattern.withoutStrategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();
    }
}
