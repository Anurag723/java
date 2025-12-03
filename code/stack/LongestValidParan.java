import java.util.Stack;

public class LongestValidParan {

    // Method to compute longest valid parentheses
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);  // Base index to help compute lengths
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                // Push the index of '('
                stack.push(i);
            } else {
                // Pop a previous '(' index
                stack.pop();

                if (stack.isEmpty()) {
                    // No matching '(' → push current index as new base
                    stack.push(i);
                } else {
                    // A valid substring ends here
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }

        return maxLen;
    }

    // Main method to test the program
    public static void main(String[] args) {
        String s1 = ")()())";
        String s2 = "(()())";
        String s3 = "((()";
        String s4 = "()(()";

        System.out.println("Input: " + s1 + " → Longest Valid: " + longestValidParentheses(s1));
        System.out.println("Input: " + s2 + " → Longest Valid: " + longestValidParentheses(s2));
        System.out.println("Input: " + s3 + " → Longest Valid: " + longestValidParentheses(s3));
        System.out.println("Input: " + s4 + " → Longest Valid: " + longestValidParentheses(s4));
    }
}
