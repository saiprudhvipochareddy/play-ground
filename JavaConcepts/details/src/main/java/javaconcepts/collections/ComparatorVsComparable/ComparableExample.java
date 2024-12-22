package javaconcepts.collections.ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<ComparableCar> carList = new ArrayList<>();
        carList.add(new ComparableCar("swift", "sedan"));
        carList.add(new ComparableCar("innova", "suv"));
        carList.add(new ComparableCar("thar", "off"));

        System.out.println("Before: "+ carList);

        Collections.sort(carList); // compareTo method overridden in ComparableCar that will execute only sorting done based on that

        System.out.println("After: "+ carList);
    }
}
