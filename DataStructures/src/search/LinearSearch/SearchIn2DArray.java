package search.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

  public static void main(String[] args) {
    int[][] arr = {
        {23, 4, 1},
        {18, 12, 3, 9},
        {78, 99, 34, 56},
        {18, 12}
    };
    int target = 34;
    int[] ans = search(arr, target); //format of return value {row,col}
    System.out.println(Arrays.toString(ans));
    System.out.println(max(arr));
    System.out.println(min(arr));
  }

  static int[] search(int[][] arr, int target) {
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) { //arr[row].length will get column length
        if (arr[row][col] == target) {
          return new int[]{row, col};
        }
      }
    }
    return new int[]{-1, -1};
  }

  static int max(int[][] arr) {
    int max = Integer.MIN_VALUE;
    for (int[] ints : arr) {
      for (int anInt : ints) {
        if (anInt > max) {
          max = anInt;
        }
      }
    }
    return max;
  }

  static int min(int[][] arr) {
    int min = Integer.MAX_VALUE;
    for (int[] ints : arr) {
      for (int anInt : ints) {
        if (anInt < min) {
          min = anInt;
        }
      }
    }
    return min;
  }

}
