public class Squareroot {

    public static int intSqrt(int n) {
        int low = 0, high = n, ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long) mid * mid <= n) {
                ans = mid;        // mid is a valid candidate
                low = mid + 1;    // try to find a larger one
            } else {
                high = mid - 1;   // mid^2 too big
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 27;
        System.out.println("Integer sqrt of " + n + " = " + intSqrt(n));
    }
}
