package recursion.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindTargetValueFromArray {

  static List<Integer> multipleOccurrenceFromLast = new ArrayList<>();
  static List<Integer> multipleOccurrenceFromStart = new ArrayList<>();

  public static void main(String[] args) {
    int[] a = {1, 2, 4, 6};
    int[] b = {1, 2, 8, 3};
    int[] c = {1, 2, 2, 3, 4};
    System.out.println("1:" + isValueFoundWay1(a, 4, 0));
    System.out.println("2:" + isValueFoundWay1(b, 10, 0));
    System.out.println("3:" + isValueFoundWay2(a, 4, 0));
    System.out.println("4:" + isValueFoundWay2(b, 10, 0));
    System.out.println("5:" + findIndex(a, 4, 0));
    System.out.println("6:" + findIndex(b, 10, 0));
    System.out.println("7:" + isValueFoundWay2FromLast(a, 4, a.length - 1));
    System.out.println("8:" + isValueFoundWay2FromLast(b, 10, b.length - 1));
    System.out.println("9:" + findIndexFromLast(a, 4, a.length - 1));
    System.out.println("10:" + findIndexFromLast(b, 10, b.length - 1));
    findAllIndexFromLast(c, 2, c.length - 1);
    System.out.println("11:" + multipleOccurrenceFromLast);
    findAllIndexFromStarting(c, 2, 0);
    System.out.println("12:" + multipleOccurrenceFromStart);
    findAllIndexFromStarting(c, 90, 0);
    System.out.println("13:" + multipleOccurrenceFromStart);
    System.out.println("14:" + findAllIndexFromStartingList(c, 2, 0, new ArrayList<Integer>()));
    System.out.println("15:" + findAllIndexFromStartingListWithoutArg(c, 2, 0));
  }

  static boolean isValueFoundWay1(int[] a, int targetValue, int startingIndex) {
    if (a.length == startingIndex) {
      return false;
    }
    if (a[startingIndex] == targetValue) {
      return true;
    } else {
      return isValueFoundWay1(a, targetValue, startingIndex + 1);
    }
  }

  static boolean isValueFoundWay2(int[] a, int targetValue, int startingIndex) {
    if (a.length == startingIndex) {
      return false;
    }
    return a[startingIndex] == targetValue || isValueFoundWay2(a, targetValue, startingIndex + 1);
  }

  static int findIndex(int[] a, int targetValue, int startingIndex) {
    if (a.length == startingIndex) {
      return -1;
    }
    if (a[startingIndex] == targetValue) {
      return startingIndex;
    }
    return findIndex(a, targetValue, startingIndex + 1);
  }

  static boolean isValueFoundWay2FromLast(int[] a, int targetValue, int lastIndex) {
    if (a.length == lastIndex || lastIndex == -1) {
      return false;
    }
    return a[lastIndex] == targetValue
        || isValueFoundWay2FromLast(a, targetValue, lastIndex - 1);
  }

  static int findIndexFromLast(int[] a, int targetValue, int lastIndex) {
    if (a.length == lastIndex || lastIndex == -1) {
      return -1;
    }
    if (a[lastIndex] == targetValue) {
      return lastIndex;
    }
    return findIndexFromLast(a, targetValue, lastIndex - 1);
  }

  static void findAllIndexFromLast(int[] a, int targetValue, int lastIndex) {
    if (a.length == lastIndex || lastIndex == -1) { //multiple occurrences
      return;
    }
    if (a[lastIndex] == targetValue) {
      multipleOccurrenceFromLast.add(lastIndex);
    }
    findAllIndexFromLast(a, targetValue, lastIndex - 1);
  }

  static void findAllIndexFromStarting(int[] a, int targetValue, int startIndex) {
    if (a.length == startIndex) { //multiple occurrences
      return;
    }
    if (a[startIndex] == targetValue) {
      multipleOccurrenceFromStart.add(startIndex);
    }
    findAllIndexFromStarting(a, targetValue, startIndex + 1);
  }

  //return arraylist
  static List<Integer> findAllIndexFromStartingList(int[] a, int targetValue, int startIndex,
      List<Integer> list) {
    if (a.length == startIndex) { //multiple occurrences with list in argument
      return list;
    }
    if (a[startIndex] == targetValue) {
      list.add(startIndex);
    }
    return findAllIndexFromStartingList(a, targetValue, startIndex + 1, list);
  }

  static List<Integer> findAllIndexFromStartingListWithoutArg(int[] a, int targetValue, int startIndex) {
    List<Integer> list = new ArrayList<>();
    if (a.length == startIndex) { //multiple occurrences without list in argument
      return list;
    }
    //this will contain answer for that function call only
    if (a[startIndex] == targetValue) {
      list.add(startIndex);
    }
    list.addAll(findAllIndexFromStartingListWithoutArg(a, targetValue, startIndex + 1));
    return list;
  }

}
