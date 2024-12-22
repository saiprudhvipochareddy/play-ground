package javaconcepts.collections.ComparatorVsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<ComparatorCar> carList = new ArrayList<>();
        carList.add(new ComparatorCar("swift", "sedan"));
        carList.add(new ComparatorCar("innova", "suv"));
        carList.add(new ComparatorCar("thar", "off"));

        Collections.sort(carList, (a, b) -> a.getCarName().compareTo(b.getCarName())); // natural sorting by passing comparator
        System.out.println("naturalSorting: " + carList);
        List<ComparatorCar> newNaturalOrderList = carList.stream()
                        .sorted(Comparator.comparing(ComparatorCar::getCarName))
                                .toList();
        System.out.println("newNaturalOrderList: " + newNaturalOrderList);

        Collections.sort(carList, (a, b) -> b.getCarName().compareTo(a.getCarName())); // desc sorting by passing comparator
        System.out.println("descSorting: " + carList);
        List<ComparatorCar> newDescOrderList = carList.stream()
                .sorted(Comparator.comparing(ComparatorCar::getCarName).reversed())
                .toList();
        System.out.println("newDescOrderList: " + newDescOrderList);
    }
}
