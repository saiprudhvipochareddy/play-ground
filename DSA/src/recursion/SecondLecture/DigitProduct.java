package recursion.SecondLecture;

public class DigitProduct {

  public static void main(String[] args) {
    int ans = prod(786);
    System.out.println(ans);
  }

  static int prod(int n) {
    if (n%10 == n) {
      return n;
    }
    int n1 = n % 10;
    int n2 = n / 10;

    return n1 * prod(n2);
  }
}
