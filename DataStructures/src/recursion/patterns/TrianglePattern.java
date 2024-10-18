package recursion.patterns;

import java.util.Arrays;

/**
 * Triangle pattern using recursion and this problem is same as bubble sort
 */
public class TrianglePattern {

  public static void main(String[] args) {
//    triangle(4, 0);
//    normalTriangle(4, 0);
//    triangleWithLoop(4);
    //   normalTriangleWithLoop(4);
    int[] arr = {4, 3, 2, 1};
    bubbleSort(arr, arr.length - 1, 0);
    System.out.println(Arrays.toString(arr));
    int[] arr1 = {4, 3, 2, 1};
    selectionSort(arr1, arr1.length - 1, 0, 0);
    System.out.println(Arrays.toString(arr1));
  }

  /**
   * This problem act in reverse where it will wait for other fun call to complete in stack to
   * complete and then print
   *
   * @param row
   * @param column
   */
  static void normalTriangle(int row, int column) {
    if (row == 0) {
      return;
    }
    if (row > column) {
      normalTriangle(row, column + 1);
      System.out.print("*");
    } else {
      normalTriangle(row - 1, 0);
      System.out.print("\n");
    }
  }

  static void triangle(int row, int column) {
    if (row == 0) {
      return;
    }
    if (row > column) {
      System.out.print("*");
      triangle(row, column + 1);
    } else {
      System.out.print("\n");
      triangle(row - 1, 0);
    }
  }

  static void triangleWithLoop(int row) {
    for (int i = row; i <= row; i--) {
      for (int j = 0; j <= i; j++) {
        if (i == 0) {
          return;
        }
        if (i > j) {
          System.out.print("*");
        } else {
          System.out.print("\n");
        }
      }
    }
  }

  static void normalTriangleWithLoop(int row) {
    for (int i = 1; i <= row; i++) {
      for (int j = 0; j <= i; j++) {
        if (i == 0) {
          return;
        }
        if (i > j) {
          System.out.print("*");
        } else {
          System.out.print("\n");
        }
      }
    }
  }

  /**
   * why the above problem is bubble sort
   */
  static void bubbleSort(int[] arr, int row, int column) {
    if (row == 0) {
      return;
    }
    if (row > column) {
      if (arr[column] > arr[column + 1]) {
        int temp = arr[column];
        arr[column] = arr[column + 1];
        arr[column + 1] = temp;
      }
      bubbleSort(arr, row, column + 1);
    } else {
      bubbleSort(arr, row - 1, 0);
    }
  }

  static void selectionSort(int[] arr, int row, int column, int max) {
    if (row == 0) {
      return;
    }
    if (row > column) {
      if (arr[column] > arr[max]) {
        selectionSort(arr, row, column + 1, column);
      } else {
        selectionSort(arr, row, column + 1, max);
      }
    } else {
      int temp = arr[max];
      arr[max] = arr[row-1];
      arr[row-1] = temp;
      selectionSort(arr, row - 1, 0, 0);
    }
  }


}
