package recursion.SecondLecture;

public class ReverseNumber {

  static int reversedNumber = 0;

  public static void main(String[] args) {
    reverse(1234);
    System.out.println(reversedNumber);
    int ans = reverseWay2(1234);
    System.out.println(ans);
    System.out.println(palindrome(1234321));
  }

  static void reverse(int number) {
    if (number == 0) {
      return;
    }
    int lastDigit = number % 10;
    int remainingDigits = number / 10;
    reversedNumber = reversedNumber * 10 + lastDigit;
    reverse(remainingDigits);
  }

  static int reverseWay2(int number) {
    int digits = (int) (Math.log10(number)) + 1;
    return helper(number, digits);
  }

  private static int helper(int n, int digits) {
    if (n % 10 == n) {
      return n;
    }
    int lastDigit = n % 10;
    int remainingDigits = n / 10;
    return (int) (lastDigit * Math.pow(10, digits - 1)) + helper(remainingDigits, digits - 1);
  }

  static boolean palindrome(int n){
    return n == reverseWay2(n);
  }
}
