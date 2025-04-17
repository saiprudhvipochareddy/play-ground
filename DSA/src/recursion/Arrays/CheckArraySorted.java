package recursion.Arrays;

public class CheckArraySorted {

  public static void main(String[] args) {
    int[] a = {1, 2, 4, 6};
    int[] b = {1, 2, 8, 3};
    System.out.println(isSortedArrayWay1(a, 0));
    System.out.println(isSortedArrayWay1(b, 0));
    System.out.println(isSortedArrayWay2(a, 0));
    System.out.println(isSortedArrayWay2(b, 0));
  }

  static boolean isSortedArrayWay1(int[] a, int startingIndex) {
    if (a.length == startingIndex + 1) {
      return true;
    }
    if (a[startingIndex] < a[startingIndex + 1]) {
      startingIndex = startingIndex + 1;
      return isSortedArrayWay1(a, startingIndex);
    } else {
      return false;
    }
  }

  static boolean isSortedArrayWay2(int[] a, int startingIndex) {
    if (a.length == startingIndex + 1) {
      return true;
    }
    return a[startingIndex] < a[startingIndex + 1] && isSortedArrayWay2(a, startingIndex + 1);
  }

}
