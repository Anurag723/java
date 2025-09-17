package string;

public class Atoi {
    public int myAtoi(String s) {
        String st = s.trim();
        int res = 0;

        if (st.length() == 0) return 0;

        // Handle '+' sign
        if (st.charAt(0) == '+') {
            for (int i = 1; i < st.length(); i++) {
                char c = st.charAt(i);
                if (c < '0' || c > '9') return res;

                int digit = c - '0';

                // Check for overflow
                if (res > (Integer.MAX_VALUE - digit) / 10) {
                    return Integer.MAX_VALUE;
                }

                res = res * 10 + digit;
            }
            return res;
        }

        // Handle '-' sign
        else if (st.charAt(0) == '-') {
            for (int i = 1; i < st.length(); i++) {
                char c = st.charAt(i);
                if (c < '0' || c > '9') return res * -1;

                int digit = c - '0';

                // Check for underflow
                if (res > (Integer.MAX_VALUE - digit) / 10) {
                    return Integer.MIN_VALUE;
                }

                res = res * 10 + digit;
            }
            return res * -1;
        }

        // Handle no sign
        else if (st.charAt(0) >= '0' && st.charAt(0) <= '9') {
            for (int i = 0; i < st.length(); i++) {
                char c = st.charAt(i);
                if (c < '0' || c > '9') return res;

                int digit = c - '0';

                // Check for overflow
                if (res > (Integer.MAX_VALUE - digit) / 10) {
                    return Integer.MAX_VALUE;
                }

                res = res * 10 + digit;
            }
            return res;
        }

        return 0;
    }

    public static void main(String[] args) {
        Atoi atoi = new Atoi();

        // Test cases
        String[] testInputs = {
            "42",
            "   -42",
            "4193 with words",
            "words and 987",
            "-91283472332",
            "+123",
            "",
            "0000012345",
            "+-12",
            "2147483648"
        };

        for (String input : testInputs) {
            int result = atoi.myAtoi(input);
            System.out.println("Input: \"" + input + "\" -> Output: " + result);
        }
    }

}
