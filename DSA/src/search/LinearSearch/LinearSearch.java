package search.LinearSearch;

public class LinearSearch {

  public static int searchGivenValueAndReturnIndex(Integer[] numbers, Integer targetValue){
    int length = numbers.length;
    if (length == 0){
      return -1;
    }
    for(int i=0; i<length; i++){
      if(numbers[i] == targetValue){
        return i;
      }
    }
    return -1;
  }

  //search target and the element itself
  public static int searchGivenValueAndReturnElement(Integer[] numbers, Integer targetValue){
    int length = numbers.length;
    if (length == 0){
      return Integer.MAX_VALUE;
    }
    for(int i=0; i<length; i++){
      if(numbers[i] == targetValue){
        return numbers[i];
      }
    }
    return Integer.MAX_VALUE;
  }

  //search target and return true or false
  public static boolean searchGivenValueAndReturnBool(Integer[] numbers, Integer targetValue){
    int length = numbers.length;
    if (length == 0){
      return false;
    }
    for(int i=0; i<length; i++){
      if(numbers[i] == targetValue){
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    Integer numbers[] = {1,2,3,4,5,6};//stored array
    Integer targetValue = 3
        ;
    int resultIndex = searchGivenValueAndReturnIndex(numbers,targetValue);
    if (resultIndex != -1)
      System.out.println("Element found at Index: "+resultIndex);
    else
      System.out.println("Element not found");
    int resultElement = searchGivenValueAndReturnElement(numbers,targetValue);
    System.out.println("Element: "+resultElement);
    boolean result = searchGivenValueAndReturnBool(numbers,targetValue);
    System.out.println("Is value found: "+result);
  }
  //Time complexity: 0(n)
}
