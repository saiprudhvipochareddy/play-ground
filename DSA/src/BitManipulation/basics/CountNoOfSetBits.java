package BitManipulation.basics;

public class CountNoOfSetBits {

  public static void main(String[] args) {
    int bruteForce = bruteForce(13);
    System.out.println("bruteForce ans: " + bruteForce);
    int better = better(13);
    System.out.println("better ans: " + better);
    int optimal = optimal(13);
    System.out.println("optimal ans: " + optimal);
  }

  private static int bruteForce(int n) {
    int count = 0;

    while (count <= 1) {
      if (n % 2 == 0) {
        count++;
      }
      n = n / 2;
    }

    return count;
  }

  private static int better(int n) {
    int count = 0;

    while (count <= 1) {
      /**
       * iteration 1
       * n = 13
       * binary = 1101
       * 1 binary = 0001
       * perform & b/w 13 binary and 1 binary then output = 0001 (count = 1)
       *
       * iteration 2
       * n = 6
       * binary = 0110
       * 1 binary = 0001
       * perform & b/w 6 binary and 1 binary then output = 0000 (count = 0)
       *
       * iteration 3
       *  n = 3
       *  binary = 0011
       *  1 binary = 0001
       *  perform & b/w 3 binary and 1 binary then output = 0001 (count = 2)
       */
      count += n & 1;
      n = n >> 1; // this equivalent to n / 2
    }

    return count;
  }

  private static int optimal(int n) {
    int count = 0;
    while (count <= 1) {
       n = n & (n-1);
       count++;
    }
    return count;
  }

}
