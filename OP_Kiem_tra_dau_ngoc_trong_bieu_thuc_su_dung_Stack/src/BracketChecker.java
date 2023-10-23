import java.util.Stack;

public class BracketChecker {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (currentChar == '(' ) {
                stack.push(currentChar);
            } else if (currentChar == ')' ) {
                if (stack.isEmpty()) {
                    return false;
                }

                char openBracket = stack.pop();
                if (!areBracketsMatching(openBracket, currentChar)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean areBracketsMatching(char open, char close) {
        return open == '(' && close == ')' ;
    }
}
