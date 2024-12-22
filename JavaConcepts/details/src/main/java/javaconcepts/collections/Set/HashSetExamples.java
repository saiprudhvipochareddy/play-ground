package javaconcepts.collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExamples {

  public static void main(String[] args) {
    Set<Integer> hashSet1 = new HashSet<>();
    hashSet1.add(1);
    hashSet1.add(45);
    hashSet1.add(0);
    hashSet1.add(11);

    Set<Integer> hashSet2 = new LinkedHashSet<>();
    hashSet2.add(12);
    hashSet2.add(451);
    hashSet2.add(10);
    hashSet2.add(11);

    // union of 2 sets
    hashSet2.addAll(hashSet1);
    hashSet2.forEach(System.out::println);
    // output:
//    12
//    451
//    10
//    11
//    0
//    1
//    45


    // intersection of 2 sets
    hashSet1 = new HashSet<>();
    hashSet1.add(11);
    hashSet1.add(451);

    System.out.println("RetainAll: ");
    hashSet2.retainAll(hashSet1);
    hashSet2.forEach(System.out::println);
    // output:
//    11
//    451

    // Diff of 2 sets
    hashSet1 = new LinkedHashSet<>();
    hashSet1.add(1);
    hashSet1.add(45);
    hashSet1.add(0);
    hashSet1.add(11);

    hashSet2 = new LinkedHashSet<>();
    hashSet2.add(12);
    hashSet2.add(451);
    hashSet2.add(10);
    hashSet2.add(11);

    System.out.println("RemoveAll: ");
    hashSet2.removeAll(hashSet1);
    hashSet2.forEach(System.out::println);
    // output:
//    12
//    451
//    10
  }

}
