package recursion.SecondLecture;

public class SumOfDigits {

  public static void main(String[] args) {
    int ans = sum(786);
    System.out.println(ans);
  }

  static int sum(int n) {
//    if (n == 0) {
//      return 0;
//    }
    if (n % 10 == n) {
      return n;
    }
    int n1 = n % 10;
    int n2 = n / 10;

    return n1 + sum(n2);
  }
}
