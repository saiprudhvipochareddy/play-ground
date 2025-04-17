package recursion;

public class Fibo {

  public static void main(String[] args) {
    Integer fiboValue = fibo(4);
    System.out.println(fiboValue);
  }

  static Integer fibo(int n) {
    if (n < 2) {
      return n;
    }
    if (n == 0 || n == 1) {
      return n;
    }
    // this is not called tail recursion as it is not last call we doing some other things
    return fibo(n - 1) + fibo(n - 2);
  }
}
