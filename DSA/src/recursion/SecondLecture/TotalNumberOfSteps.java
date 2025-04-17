package recursion.SecondLecture;

public class TotalNumberOfSteps {

  public static void main(String[] args) {
    System.out.println(numberOfSteps(14));
  }
    public static int numberOfSteps(int num) {
      return helper(num, 0);
    }

    private static int helper(int num, int count){
      if (num == 0){
        return count;
      }
      if (num % 2 == 0){
        num = num / 2;
      } else {
        num = num - 1;
      }
      count = count + 1;
      return helper(num, count);
    }

}
