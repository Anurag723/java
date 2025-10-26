public class TrappingRainwater {

    public static int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] lftmx = new int[n];
        int[] rgtmx = new int[n];

        // Compute left max for each position
        lftmx[0] = height[0];
        for (int i = 1; i < n; i++) {
            lftmx[i] = Math.max(lftmx[i - 1], height[i]);
        }

        // Compute right max for each position
        rgtmx[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rgtmx[i] = Math.max(rgtmx[i + 1], height[i]);
        }

        // Calculate trapped water
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += Math.min(lftmx[i], rgtmx[i]) - height[i];
        }

        return res;
    }

    // Runner method
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int trappedWater = trap(height);

        System.out.println("Trapped Rain Water: " + trappedWater);
    }
}
