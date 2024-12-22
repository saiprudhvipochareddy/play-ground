package javaconcepts.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Collection {
    //please refer below document for the examples
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(4);

        numbers.remove(2); // remove using index
        System.out.println(numbers);

        numbers.remove(Integer.valueOf(4)); //remove using object (first occurrence)
        System.out.println(numbers);

        Stack<Integer> stackValues = new Stack<>();
        stackValues.addAll(numbers);
        System.out.println("stack: " + stackValues);

        System.out.println("numbers are contains in stack: " + numbers.containsAll(stackValues));

        stackValues.add(100);
        stackValues.removeAll(numbers);
        System.out.println("stack: " + stackValues);

        stackValues.clear();
        System.out.println("stack: " + stackValues);

        System.out.println("isEmpty(): " + stackValues.isEmpty());
    }


}
