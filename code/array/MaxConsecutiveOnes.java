public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }

    // Example usage
    public static void main(String[] args) {
        MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
        System.out.println(mco.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1})); // Output: 3
        System.out.println(mco.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1})); // Output: 2
    }
}
