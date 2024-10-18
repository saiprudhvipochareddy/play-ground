public class BinarySearch {

  static final Integer MID_FACTOR = 2;

  static final Integer INITIAL_LEFT_INDEX = 0;


  public static int binarySearch(Integer[] numbers, Integer targetValue){
    Integer lengthOfNumbers = numbers.length;
    Integer leftIndex = INITIAL_LEFT_INDEX;
    Integer rightIndex = lengthOfNumbers - 1;
    while (leftIndex <= rightIndex) {
      Integer midIndex = (leftIndex + rightIndex)/MID_FACTOR;
      if (numbers[midIndex] == targetValue){
        return midIndex;
      }else if (numbers[midIndex] < targetValue){
        leftIndex = midIndex + 1;
      }else {
        rightIndex = midIndex - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Integer numbers[] = {1,2,3,4,5,6};//stored array
    Integer targetValue = 3;
    int result = binarySearch(numbers,targetValue);
    if (result != -1)
      System.out.println("Element found at Index: "+result);
    else
      System.out.println("Element not found");

  }


}
