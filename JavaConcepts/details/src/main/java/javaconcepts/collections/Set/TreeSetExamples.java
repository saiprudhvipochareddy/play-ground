package javaconcepts.collections.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {

  public static void main(String[] args) {
    Set<Integer> treeSet = new TreeSet<>();
    treeSet.add(100);
    treeSet.add(1);
    treeSet.add(0);
    treeSet.add(50);

    Iterator<Integer> iterator = treeSet.iterator();

    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    // output:
//    0
//    1
//    50
//    100

    // desc
    Set<Integer> treeSet2 = new TreeSet<>(Comparator.reverseOrder());
    treeSet2.add(100);
    treeSet2.add(1);
    treeSet2.add(0);
    treeSet2.add(50);

    treeSet2.forEach(System.out::println);
    // output:
//    100
//    50
//    1
//    0
  }
}
