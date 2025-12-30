public class UniqueBTree {

    private int[] memo;

    public int numTrees(int n) {
        memo = new int[n + 1];
        return count(n);
    }

    private int count(int n) {
        if (n <= 1) {
            return 1;
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        int total = 0;
        for (int root = 1; root <= n; root++) {
            total += count(root - 1) * count(n - root);
        }

        memo[n] = total;
        return total;
    }

    // ---------- Runner ----------
    public static void main(String[] args) {
        UniqueBTree solution = new UniqueBTree();

        int n = 3; // change this value to test other inputs
        int result = solution.numTrees(n);

        System.out.println("Number of unique BSTs for n = " + n + " is: " + result);
    }
}
