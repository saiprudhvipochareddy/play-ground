package search.LinearSearch;

public class SearchInRange {

  public static int searchInGivenRange(Integer[] numbers, Integer targetValue, int start, int end) {
    int length = numbers.length;
    if (length == 0) {
      return -1;
    }
    for (int i = start; i <=end; i++) {
      if (numbers[i] == targetValue) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Integer numbers[] = {1, 2, 3, 4, 5, 6};//stored array
    Integer targetValue = 6;
    int resultIndex = searchInGivenRange(numbers, targetValue, 1,4);
    if (resultIndex != -1) {
      System.out.println("Element found at Index: " + resultIndex);
    } else {
      System.out.println("Element not found");
    }
  }
}
