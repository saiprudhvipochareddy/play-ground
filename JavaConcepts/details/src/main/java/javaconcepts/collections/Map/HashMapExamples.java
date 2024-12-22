package javaconcepts.collections.Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExamples {

  public static void main(String[] args) {
    Map<Integer, String> hashMap = new HashMap<>(); // null keys and values are accepted in hash map
    hashMap.put(null, "Hello");
    hashMap.put(null, "PR"); // Hello will get overridden by PR
    hashMap.put(1, null);
    hashMap.put(2, "SJ");
    hashMap.put(0, "RRRRR");
    hashMap.put(10, "RJ");

    hashMap.putIfAbsent(1, "Hello"); // As it is null value will update to Hello
    hashMap.putIfAbsent(2, "New"); // it will only update value when only it is null\
    hashMap.putIfAbsent(3, "RR");
    hashMap.put(6, "IJ");

    for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
      System.out.println("Key: " + entry.getKey() + " Value: "+ entry.getValue());
    }
    hashMap.forEach((key, value) -> {
      System.out.println("For each key: " + key + " value: " + value);
    });
//    Output:
//    Key: null Value: PR
//    Key: 0 Value: RRRRR
//    Key: 1 Value: Hello
//    Key: 2 Value: SJ
//    Key: 3 Value: RR
//    Key: 6 Value: IJ
//    Key: 10 Value: RJ

    System.out.println("isEmpty(): " + hashMap.isEmpty());
    // isEmpty(): false
    System.out.println("size(): " + hashMap.size());
    // size(): 4
    System.out.println("containsKey(): " + hashMap.containsKey(null));
    // containsKey(): true
    System.out.println("containsKey(): " + hashMap.containsKey(300));
    // containsKey(): false
    System.out.println("containsValue(): " + hashMap.containsValue("SJ"));
    // containsValue(): true
    System.out.println("containsValue(): " + hashMap.containsValue("RRR"));
    // containsValue(): false
    System.out.println("get(): " + hashMap.get(1));
    // get(): Hello
    System.out.println("getOrDefault(): " + hashMap.getOrDefault(300, "prudhvi"));
//    getOrDefault(): prudhvi
    System.out.println("remove: " + hashMap.remove(null));

    for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
      System.out.println("Key: " + entry.getKey() + " Value: "+ entry.getValue());
    }

//    Key: 1 Value: Hello
//    Key: 2 Value: SJ
//    Key: 3 Value: RR

    //keySet()
    for (Integer key : hashMap.keySet()) {
      System.out.println("Key: " + key);
    }

//    Key: 1
//    Key: 2
//    Key: 3

    //values()
    for (String values : hashMap.values()) {
      System.out.println("values: " + values);
    }
//    values: Hello
//    values: SJ
//    values: RR

    /**
     *  Below are thread safe versions of hash map.
     *  1. ConcurrentHashMap
     *  2. HashTable
     */
    Map<Integer, String>  concurrentHashMap = new ConcurrentHashMap<>();
//    concurrentHashMap.put(null, "Hello");
//    concurrentHashMap.put(null, "PR"); // Hello will get overridden by PR
//    concurrentHashMap.put(1, null); // Note: nulls are nots allowed
    concurrentHashMap.put(2, "SJ");
    concurrentHashMap.put(6, "IJ");
    concurrentHashMap.put(3, "RJ");
    concurrentHashMap.put(7, "AP");

    System.out.println("ConcurrentHashMap");
    for (Map.Entry<Integer, String> entry : concurrentHashMap.entrySet()) {
      System.out.println("Key: " + entry.getKey() + " Value: "+ entry.getValue());
    }

    Map<Integer, String>  hashTable = new Hashtable<>();
//    concurrentHashMap.put(null, "Hello");
//    concurrentHashMap.put(null, "PR"); // Hello will get overridden by PR
//    hashTable.put(1, null); // Note: nulls are nots allowed
    hashTable.put(2, "SJ");
    hashTable.put(3, "RJ");

    System.out.println("hasTable");
    for (Map.Entry<Integer, String> entry : hashTable.entrySet()) {
      System.out.println("Key: " + entry.getKey() + " Value: "+ entry.getValue());
    }
  }
}
