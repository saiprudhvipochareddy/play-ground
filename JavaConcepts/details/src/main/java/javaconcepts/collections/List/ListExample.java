package javaconcepts.collections.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new LinkedList<>();
        // practise later
        System.out.println(arrayList.contains(1));


        Vector<Integer> vectorObj = new Vector<>(); // the methods that vector contains are synchronized and thread safe
        // it does lock/unlock internally
        vectorObj.add(200);

        System.out.println(vectorObj.get(0));

    }
}
