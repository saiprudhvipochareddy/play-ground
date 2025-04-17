package BitManipulation.basics;

public class ConvertBinaryToDecimal {

  public static void main(String[] args) {
    int ans = binaryToDecimal("1101");
    System.out.println(ans);
    int ans1 = binaryToDecimalSimple("1101");
    System.out.println(ans1);
  }

  private static int binaryToDecimal(String input) {
    int length = input.length();
    int power = 0;
    int val = 0;
    for (int i = length - 1 ; i >= 0; i--) {
      if (input.charAt(i) == '1') {
        val += (int) Math.pow(2, power);
      }
      power++;
    }
    return val;
  }

  private static int binaryToDecimalSimple(String input) {
    return Integer.parseInt(input, 2);
  }

}
