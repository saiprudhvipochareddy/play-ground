package recursion.SecondLecture;

public class Nto1 {

  public static void main(String[] args) {
    fun(5);
    System.out.println("--------");
    funReverse(5);
    System.out.println("--------");
    funBoth(5);
    concept(5);
  }

  // concept
  static void concept(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n);
//        concept(n--);
    concept(--n);
//        n-- vs --n
  }

  static void fun(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n);
    fun(n - 1);
  }

  static void funReverse(int n) {
    if (n == 0) {
      return;
    }
    funReverse(n - 1);
    System.out.println(n);
  }

  static void funBoth(int n) {
    if (n == 0) {
      return;
    }
    System.out.println(n);
    funReverse(n - 1);
    System.out.println(n);
  }

}
