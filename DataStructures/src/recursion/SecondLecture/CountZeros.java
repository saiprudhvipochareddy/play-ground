package recursion.SecondLecture;

public class CountZeros {

  static int count = 0;

  public static void main(String[] args) {
    count(70806);
    System.out.println(count);
    System.out.println(countByArgument(70800006, 0));
  }

  static void count(int number) {
    if (number == 0) {
      return;
    }
    int lastDigit = number % 10;
    if (lastDigit == 0) {
      count = count + 1;
    }
    count(number / 10);
  }

  // special  pattern
  static int countByArgument(int number, int count) {
    if (number == 0) {
      return count;
    }
    int lastDigit = number % 10;
    if (lastDigit == 0) {
      count = count + 1;
    }
    return countByArgument(number / 10, count);
  }
}
