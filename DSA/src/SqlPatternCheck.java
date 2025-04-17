import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SqlPatternCheck {

  private static boolean isValidFormula(String formula) {
    String subqueryPattern = "\\b(TRUNCATE|CREATE|ALTER|DROP|GRANT|REVOKE|SELECT|UPDATE|DELETE|"
        + "INSERT|FROM|WHERE|JOIN|INNER|OUTER|LEFT|RIGHT|ON|AND|OR|IN|VALUES|SET|GROUP BY|ORDER BY|LIMIT)\\b";

    Pattern pattern = Pattern.compile(subqueryPattern, Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(formula);

//    String escapedFormula = StringEscapeUtils.escapeJava(formula);

    return matcher.find();
  }

  public static void main(String[] args) {
    String formula1 = "SELECT * FROM table WHERE condition";
    String formula2 = "UPDATE table SET column = value WHERE condition";
    String formula3 = "CASE \n"
        + "        WHEN ${Partner}='in prakash' THEN 'Content Partners' \n"
        + "        ELSE NULL \n"
        + "    END AS Partner_Category";

    boolean isValid1 = isValidFormula(formula1);
    boolean isValid2 = isValidFormula(formula2);
    boolean isValid3 = isValidFormula(formula3);

    System.out.println("Formula 1 is valid: " + isValid1); // Output: true
    System.out.println("Formula 2 is valid: " + isValid2); // Output: true
    System.out.println("Formula 3 is valid: " + isValid3);
  }

}
