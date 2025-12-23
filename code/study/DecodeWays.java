public class DecodeWays {

    public static void main(String[] args) {
        DecodeWays solution = new DecodeWays();

        String s1 = "226";
        String s2 = "12";
        String s3 = "06";

        System.out.println("Input: " + s1 + " → Output: " + solution.numDecodings(s1));
        System.out.println("Input: " + s2 + " → Output: " + solution.numDecodings(s2));
        System.out.println("Input: " + s3 + " → Output: " + solution.numDecodings(s3));
    }

    public int numDecodings(String s) {
        return decode(s, 0);
    }

    private int decode(String s, int index) {
        // Reached end → valid decoding
        if (index == s.length()) {
            return 1;
        }

        // Starts with 0 → invalid
        if (s.charAt(index) == '0') {
            return 0;
        }

        // Take one digit
        int count = decode(s, index + 1);

        // Take two digits if valid
        if (index + 1 < s.length()) {
            int two = Integer.parseInt(s.substring(index, index + 2));
            if (two >= 10 && two <= 26) {
                count += decode(s, index + 2);
            }
        }

        return count;
    }

    public int numDecodingsOptimise(String s) {
        int n = s.length();
        if (n == 0 || s.charAt(0) == '0') return 0;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            // One digit
            if (s.charAt(i - 1) != '0') {
                dp[i] += dp[i - 1];
            }

            // Two digits
            int two = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
            if (two >= 10 && two <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

}
