package recursion;


public class BinarySearchRecursion {
  static final Integer MID_FACTOR = 2;

  static final Integer INITIAL_LEFT_INDEX = 0;
  public static int binarySearch(Integer[] numbers, Integer targetValue, Integer leftIndex, Integer rightIndex){
    if(leftIndex > rightIndex){
      return -1;
    }
    Integer midIndex = (leftIndex + rightIndex)/MID_FACTOR;

    if (numbers[midIndex] == targetValue) {
      return midIndex;
    } else if (numbers[midIndex] < targetValue) {
      leftIndex = midIndex + 1;
      return binarySearch(numbers, targetValue, leftIndex, rightIndex);
    } else {
      rightIndex = midIndex - 1;
      return binarySearch(numbers, targetValue, leftIndex, rightIndex);
    }
  }

  public static void main(String[] args) {
    Integer numbers[] = {1,2,3,4,5,6};//stored array
    Integer targetValue = 6;
    Integer lengthOfNumbers = numbers.length;
    Integer leftIndex = INITIAL_LEFT_INDEX;
    Integer rightIndex = lengthOfNumbers - 1;
    int result = binarySearch(numbers,targetValue,leftIndex,rightIndex);
    if (result != -1)
      System.out.println("Element found at Index: "+result);
    else
      System.out.println("Element not found");

  }
}
