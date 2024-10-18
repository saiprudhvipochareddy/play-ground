package search.LinearSearch;

public class FindMin {

  public static void main(String[] args) {
    Integer numbers[] = {1,2,3,-4,5,6};
    System.out.println(minValue(numbers));
  }

  //return the min value in the array
  public static int minValue(Integer numbers[]){
    Integer length = numbers.length;
    Integer minValue = numbers[0];
    for(int i=1; i<length; i++){
      if(minValue > numbers[i]){
        minValue = numbers[i];
      }
    }
    return minValue;
  }
}
