package BitManipulation.basics;

import java.util.Arrays;

public class ConvertDecimalToBinary {

  public static void main(String[] args) {
   String ans = decimalToBinary(22);
   System.out.println(ans);
    String ans1 = decimalToBinarySimple(22);
    System.out.println(ans1);
  }

  private static String decimalToBinary(int input) {
    StringBuilder val = new StringBuilder();
    while (input > 0) {
      if (input % 2 == 1) {
        val.append('1');
      } else {
        val.append('0');
      }
      input = input / 2;
    }
    System.out.println("Before reverse: " + val);
    return reverseString(val.toString());
  }

  private static String reverseString(String input) {
    int left = 0;
    int right = input.length() - 1;
    char[] inputArray = input.toCharArray();

    while (left <= right) {
      char temp = inputArray[right];
      inputArray[right] = inputArray[left];
      inputArray[left] = temp;
      left++;
      right--;
    }

    return Arrays.toString(inputArray);
  }

  private static String decimalToBinarySimple(int input) {
    return Integer.toBinaryString(input);
  }

}
