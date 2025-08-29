public class kokobanana {
    public int minEatingSpeed(int[] piles, int h) {
        int si = 1;
        int ei = gtmax(piles);
        int ans = Integer.MAX_VALUE;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            long k = hourly(piles, mid);          // ← long

            if (k <= (long) h) {                  // ← compare as long
                ans = mid;
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        return ans;
    }

    public int gtmax(int[] nums) {
        int mx = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i >= mx) mx = i;
        }
        return mx;
    }

    public long hourly(int[] nums, int mid) {     // ← return long
        long time = 0;
        for (int pile : nums) {
            time += (pile + mid - 1) / mid;       // ← stays within int per term, sum in long
        }
        return time;                               // ← no narrowing cast
    }
    public static void main(String[] args) {
        kokobanana solution = new kokobanana();
        int[] piles = {805306368, 805306368, 805306368};
        int h = 100;
        System.out.println("Minimum eating speed: " + solution.minEatingSpeed(piles, h));  // Output should be 3
    }

}
