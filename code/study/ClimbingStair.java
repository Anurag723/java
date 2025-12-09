public class ClimbingStair {

    // Inner Solution class, same as LeetCode format
    static class Solution {
        public int climbStairs(int n) {
            if (n <= 2) return n;

            int a = 1; // ways to reach step 1
            int b = 2; // ways to reach step 2

            for (int i = 3; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }

            return b;
        }
    }

    // Main method
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n = 10;  // you can change this value
        int result = sol.climbStairs(n);

        System.out.println("Number of ways to climb " + n + " stairs: " + result);
    }
}
