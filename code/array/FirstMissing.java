public class FirstMissing {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        // Step 1: Place each number in its correct position if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Step 2: Find the first index where nums[i] != i + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 3: If all positions are correct, return n + 1
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, -1, 1};
        int[] nums2 = {1, 2, 0};
        int[] nums3 = {7, 8, 9, 11, 12};

        System.out.println("First missing positive (Test 1): " + firstMissingPositive(nums1)); // Output: 2
        System.out.println("First missing positive (Test 2): " + firstMissingPositive(nums2)); // Output: 3
        System.out.println("First missing positive (Test 3): " + firstMissingPositive(nums3)); // Output: 1
    }
}
