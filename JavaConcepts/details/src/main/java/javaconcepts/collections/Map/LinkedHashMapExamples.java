package javaconcepts.collections.Map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExamples {

  public static void main(String[] args) {
    Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // maintains insertion order
    linkedHashMap.put(1, "PJ");
    linkedHashMap.put(0, "PJ");
    linkedHashMap.put(31, null);
    linkedHashMap.put(2, "SJ");

    for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
      System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
    }
//    output:
//    Key: 1 Value: PJ
//    Key: 0 Value: PJ
//    Key: 31 Value: null
//    Key: 2 Value: SJ

    linkedHashMap.forEach(
        (key, value) -> System.out.println("For each key: " + key + " Value: " + value));
//    output:
//    For each key: 1 Value: PJ
//    For each key: 0 Value: PJ
//    For each key: 31 Value: null
//    For each key: 2 Value: SJ

    // Below example is for the maintain access order
    Map<Integer, String> accessOrder = new LinkedHashMap<>(16, .75f, Boolean.TRUE);
    accessOrder.put(1, "PJ");
    accessOrder.put(0, "RJ");
    accessOrder.put(31, null);
    accessOrder.put(2, "SJ");

    System.out.println(accessOrder.get(1));
    System.out.println(accessOrder.get(0));

    accessOrder.forEach(
        (key, value) -> System.out.println("For each key: " + key + " Value: " + value));
    // output:
//    For each key: 31 Value: null
//    For each key: 2 Value: SJ
//    For each key: 1 Value: PJ
//    For each key: 0 Value: RJ


    // Thread safe use collections utility here to make linkedHashMap thread safe
    Map<Integer, String> threadSafeLinkedHashMap = Collections.synchronizedMap(new LinkedHashMap<>());
    threadSafeLinkedHashMap.put(1, "PJ");
    threadSafeLinkedHashMap.put(0, "RJ");
    threadSafeLinkedHashMap.put(31, null);
    threadSafeLinkedHashMap.put(2, "SJ");

    for (Map.Entry<Integer, String> entry : threadSafeLinkedHashMap.entrySet()) {
      System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
    }


  }

}
