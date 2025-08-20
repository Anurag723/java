import java.util.*;

public class maxprodsubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int mxdp = nums[0];
        int mndp = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp_mx = Math.max(nums[i], Math.max(nums[i] * mxdp, nums[i] * mndp));
            int temp_mn = Math.min(nums[i], Math.min(nums[i] * mxdp, nums[i] * mndp));

            mxdp = temp_mx;
            mndp = temp_mn;

            result = Math.max(result, mxdp);
        }

        return result;
    }

    public static void main(String[] args) {
        maxprodsubarray solver = new maxprodsubarray();

        // Example test cases
        int[] nums1 = {2, 3, -2, 4};
        int[] nums2 = {-2, 0, -1};
        int[] nums3 = {-2, 3, -4};

        System.out.println("Max product of nums1: " + solver.maxProduct(nums1)); // Output: 6
        System.out.println("Max product of nums2: " + solver.maxProduct(nums2)); // Output: 0
        System.out.println("Max product of nums3: " + solver.maxProduct(nums3)); // Output: 24
    }
}
