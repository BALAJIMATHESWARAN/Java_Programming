import java.util.*;
import java.util.regex.*;

public class FiveProgram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String expression = in.nextLine().replaceAll("\\s+", "");
        in.close();

        // Step 1: Simplify all constant multiplications and additions
        String reduced = simplifyNumericParts(expression);

        // Step 2: If the entire expression is just a number -> no operations
        if (reduced.matches("\\d+")) {
            System.out.println(0);
            return;
        }

        // Step 3: Count current + and * operators
        int currentOps = countOperations(reduced);

        // Step 4: Try identifying possible factoring forms
        int minOps = currentOps;
        if (isFormType1(reduced)) minOps = Math.min(minOps, 3); // (a1x+b1)*(a2x+b2)
        if (isFormType2(reduced)) minOps = Math.min(minOps, 6); // (a1x+b1)*(a2y+b2)
        if (isFormType3(reduced)) minOps = Math.min(minOps, 6); // (a1x+b1y)*(a2x+b2)

        // Step 5: Print minimum operation count
        System.out.println(minOps);
    }

    // Simplify numeric-only subexpressions like 3*2 or 4+6
    private static String simplifyNumericParts(String exp) {
        boolean changed = true;
        while (changed) {
            changed = false;

            // simplify multiplications first
            Matcher mul = Pattern.compile("(\\d+)\\*(\\d+)").matcher(exp);
            if (mul.find()) {
                int a = Integer.parseInt(mul.group(1));
                int b = Integer.parseInt(mul.group(2));
                exp = exp.substring(0, mul.start()) + (a * b) + exp.substring(mul.end());
                changed = true;
                continue;
            }

            // simplify additions next
            Matcher add = Pattern.compile("(\\d+)\\+(\\d+)").matcher(exp);
            if (add.find()) {
                int a = Integer.parseInt(add.group(1));
                int b = Integer.parseInt(add.group(2));
                exp = exp.substring(0, add.start()) + (a + b) + exp.substring(add.end());
                changed = true;
            }
        }
        return exp;
    }

    // Count number of '+' and '*' operations
    private static int countOperations(String exp) {
        int adds = exp.length() - exp.replace("+", "").length();
        int mults = exp.length() - exp.replace("*", "").length();
        return adds + mults;
    }

    // Detect Form 1: (a1x+b1)*(a2x+b2)
    private static boolean isFormType1(String exp) {
        return exp.contains("x*x") || exp.matches(".*x\\*\\(x[+\\d\\)]*.*");
    }

    // Detect Form 2: (a1x+b1)*(a2y+b2)
    private static boolean isFormType2(String exp) {
        return exp.contains("x*y") || exp.contains("y*x");
    }

    // Detect Form 3: (a1x+b1y)*(a2x+b2)
    private static boolean isFormType3(String exp) {
        boolean hasXX = exp.contains("x*x");
        boolean hasXY = exp.contains("x*y") || exp.contains("y*x");
        return hasXX && hasXY;
    }
}
