import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {

  public static void main(String[] args) {
    List<String[]> parameters = new ArrayList<>();
    parameters.add(new String[]{"All", "New"});
    parameters.add(new String[]{"New Customer - Online", "New Customer - Offline"});
    parameters.add(new String[]{"revenue", "order", "new-order"});
    parameters.add(new String[]{"5%", "15%"});
    parameters.add(new String[]{"Day0", "Day1", "Day2"});

    List<String[]> combinations = generateCombinations(parameters, 0);

    for (String[] combination : combinations) {
      System.out.println(Arrays.toString(combination));
    }
  }

  public static List<String[]> generateCombinations(List<String[]> parameters, int depth) {
    List<String[]> results = new ArrayList<>();
    if (depth == parameters.size()) {
      results.add(new String[parameters.size()]);
      return results;
    }

    for (String choice : parameters.get(depth)) {
      List<String[]> subResults = generateCombinations(parameters, depth + 1);
      for (String[] subResult : subResults) {
        String[] newCombination = subResult.clone();
        newCombination[depth] = choice;
        results.add(newCombination);
      }
    }

    return results;
  }
}
