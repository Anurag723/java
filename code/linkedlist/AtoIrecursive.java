package code.linkedlist;

public class AtoIrecursive {
    private int index = 0;
    private int sign = 1;
    private long result = 0;

    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        // Remove leading spaces
        s = s.trim();
        if (s.isEmpty()) return 0;

        return parseRecursively(s);
    }

    private int parseRecursively(String s) {
        if (index >= s.length()) {
            return clampResult();
        }

        char c = s.charAt(index);

        // Handle sign
        if (index == 0 && (c == '+' || c == '-')) {
            sign = (c == '-') ? -1 : 1;
            index++;
            return parseRecursively(s);
        }

        // If digit, update result
        if (Character.isDigit(c)) {
            result = result * 10 + (c - '0');

            // Clamp early if out of bounds
            if (sign * result <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (sign * result >= Integer.MAX_VALUE) return Integer.MAX_VALUE;

            index++;
            return parseRecursively(s);
        }

        // Non-digit terminates parsing
        return clampResult();
    }

    private int clampResult() {
        result = result * sign;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int) result;
    }

    // For testing
    public static void main(String[] args) {
        AtoIrecursive sol = new AtoIrecursive();

        System.out.println(sol.myAtoi("42"));             // 42
        System.out.println(sol.myAtoi("   -42"));         // -42
        System.out.println(sol.myAtoi("4193 with words")); // 4193
        System.out.println(sol.myAtoi("words and 987"));   // 0
        System.out.println(sol.myAtoi("-91283472332"));    // -2147483648
    }
}
