package sort;

import java.util.Arrays;

public class BubbleSort {

  /**
   * Once numbers are stored still this storing technique will check, but reduce the storing
   * so bubble sort is not efficient algorithm
   * Time complexity: 0(n*n)
   */

  public static Integer[] bubbleSort(Integer[] numbers) {
    Integer lengthOfNumbers = numbers.length;
    for (int i = 0; i < lengthOfNumbers; i++) {
      for (int j = 0; j < lengthOfNumbers - 1; j++) {
        if (numbers[j] > numbers[j + 1]) {
          Integer tempVariable = numbers[j];
          numbers[j] = numbers[j + 1];
          numbers[j + 1] = tempVariable;
        }
      }
    }
    return numbers;
  }

  public static void main(String[] args) {
    Integer numbers[] = {13, 99, 11, 8, 2, 1};// unsorted array
    Integer[] result = bubbleSort(numbers);
    System.out.println("Result: " + Arrays.toString(result));
  }

}
