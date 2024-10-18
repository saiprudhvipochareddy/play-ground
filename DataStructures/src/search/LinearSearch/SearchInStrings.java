package search.LinearSearch;

public class SearchInStrings {

  public static void main(String[] args) {
    String name = "prudhvi";
    char target = 'u';
    System.out.println(search(name, target));
    System.out.println(searchUsingForEach(name, target));
  }

  //using for-each
  public static boolean searchUsingForEach(String name, char target) {
    if (name.length() == 0) {
      return false;
    }
    for (char ch: name.toCharArray()) {
      if (ch == target) {
        return true;
      }
    }
    return false;
  }

  public static boolean search(String name, char target) {
    if (name.length() == 0) {
      return false;
    }
    for (int index = 0; index < name.length(); index++) {
      if (name.charAt(index) == target) {
        return true;
      }
    }
    return false;
  }
}
