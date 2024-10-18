import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Stack;

public class ReverseString {
  public static String reverseString(String inputValueToReverse){
    Integer length = inputValueToReverse.length();
    String finalValue = "";
    for(int i=length-1; i>=0; i--){
      Character c = inputValueToReverse.charAt(i);
      finalValue += c;
    }
    return finalValue;
  }
  public static void main(String[] args) {
    String inputValueToReverse = "Prudhvi";
    String finalV = reverseString(inputValueToReverse);
    System.out.println(finalV);
  }

}
