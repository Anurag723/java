package string;

class strtoint{
    public int myAtoi(String s) {
        char[] rs = s.trim().toCharArray();     // Remove leading/trailing spaces
        int res = 0;
        boolean isNeg = true;

        if (rs.length == 0) return 0;           // Edge case: empty string after trim

        // Handle sign
        int i = 0;
        if (rs[0] == '-') {
            isNeg = false;
            i = 1;
        } else if (rs[0] == '+') {
            i = 1;
        }

        // Loop through digits
        for (; i < rs.length; i++) {
            if (rs[i] < '0' || rs[i] > '9') {
                break;                          // Stop on first non-digit
            }

            int digit = rs[i] - '0';

            // Check for overflow before it happens
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                return isNeg ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            res = (res * 10) + digit;
        }

        return isNeg ? res : -res;
    }

    public static void main(String[] args) {
        strtoint sol = new strtoint();

        // Test cases
        String[] testCases = {
            "42",
            "   -42",
            "4193 with words",
            "words and 987",
            "-91283472332",
            "91283472332",
            "   +0 123",
            "+1",
            "",
            "+",
            "-",
            "  -0012a42"
        };

        for (String test : testCases) {
            int result = sol.myAtoi(test);
            System.out.println("Input: \"" + test + "\" ➝ Output: " + result);
        }
    }

}