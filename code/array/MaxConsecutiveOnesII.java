public class MaxConsecutiveOnesII {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0, maxLen = 0, zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnesII mco2 = new MaxConsecutiveOnesII();
        System.out.println(mco2.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0})); // Output: 4
        System.out.println(mco2.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1}));    // Output: 4
    }
}
