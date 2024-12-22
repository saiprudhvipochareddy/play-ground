package javaconcepts.collections.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExamples {

  public static void main(String[] args) {
    Map<Integer, String> treeMap = new TreeMap<>();
    treeMap.put(10, "PJ");
    treeMap.put(1, "Rj");
    treeMap.put(5, "PR");
    treeMap.put(0, "Hello");

    //asc (natural order)
    treeMap.forEach(
        (key, value) -> System.out.println(key + " : " + value));

    Map<Integer, String> treeMapDesc = new TreeMap<>(Comparator.reverseOrder());
    treeMapDesc.put(10, "PJ");
    treeMapDesc.put(1, "Rj");
    treeMapDesc.put(5, "PR");
    treeMapDesc.put(0, "Hello");
    // output:
//    0 : Hello
//    1 : Rj
//    5 : PR
//    10 : PJ


    //desc
    treeMapDesc.forEach(
        (key, value) -> System.out.println(key + " : " + value));
    // output:
//    10 : PJ
//    5 : PR
//    1 : Rj
//    0 : Hello
  }

}
