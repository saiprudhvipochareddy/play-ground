package sort;


import java.util.Arrays;

public class SelectionSort {

  public static Integer[] selectionWithMax(Integer[] numbers) {
    Integer[] newNumbers = null;
    for (int i = 0; i < numbers.length; i++) {
      // find the max item in the remaining array and swap with crt index
      Integer last = numbers.length - i - 1;
      Integer maxIndex = getMaxIndex(numbers, 0, last);
      newNumbers = swap(numbers, maxIndex, last);
    }
    return newNumbers;
  }

  public static void selectionWithMin(Integer[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      // find the min item in the remaining array and swap with crt index
      Integer minIndex = getMinIndex(numbers, i, numbers.length - 1);
      swap(numbers, minIndex, i);
    }
  }

  private static int getMaxIndex(Integer[] arr, Integer start, Integer last) {
    Integer max = start;
    for (Integer i = start; i <= last; i++) {
      if (arr[max] < arr[i]) {
        max = i;
      }
    }
    return max;
  }

  private static int getMinIndex(Integer[] arr, Integer start, Integer last) {
    Integer min = start;
    for (Integer i = start; i <= last; i++) {
      if (arr[min] > arr[i]) {
        min = i;
      }
    }
    return min;
  }

  static Integer[] swap(Integer[] arr, Integer first, Integer second){
    Integer temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;

    return arr;
  }

  public static void main(String[] args) {
    Integer numbers[] = {13, 99, 11, 8, 2, 1};// unsorted array
    Integer[] maxSelection = selectionWithMax(numbers);
    System.out.println("Result Max: " + Arrays.toString(maxSelection));
    Integer numbers2[] = {12, 99, 11, 89, 2, 1};
    selectionWithMin(numbers2);
    System.out.println("Result Min: " + Arrays.toString(numbers2));
  }

}
