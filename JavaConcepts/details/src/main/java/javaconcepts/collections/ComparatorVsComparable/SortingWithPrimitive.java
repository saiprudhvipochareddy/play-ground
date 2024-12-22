package javaconcepts.collections.ComparatorVsComparable;

import java.util.Arrays;
import java.util.Comparator;

public class SortingWithPrimitive {
    public static void main(String[] args) {
        Integer[] a = {6, 4, 0, 3,14, 67};

        System.out.println("Before Sorted array: "+ Arrays.toString(a));

        //Arrays.sort(a); //natural order
        Arrays.sort(a, Comparator.comparing(t->t)); //other way of declaring

        System.out.println("After Sorted array natural order: "+ Arrays.toString(a));

        Arrays.sort(a, (t1, t2)-> t2 - t1); // desc order
        Arrays.sort(a, Comparator.reverseOrder()); // other way of defining

        System.out.println("After Sorted array desc order: "+ Arrays.toString(a));

    }
}
