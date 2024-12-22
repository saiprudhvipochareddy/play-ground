package javaconcepts.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);

        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()) {
            var next = iterator.next();
            System.out.println(next);
            if(next == 5) {
                iterator.remove();
            }
        }

        System.out.println("using for");

        for(Integer number: numbers) {
            System.out.println(number);
        }

        System.out.println("using for each");

        numbers.forEach(System.out::println);
    }
}
