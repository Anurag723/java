import java.util.Arrays;

public class MaximumGap {

    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int temp = 0;

        if (nums.length <= 1) return 0;

        for (int i = 1; i < nums.length; i++) {
            if (temp <= nums[i] - nums[i - 1]) {
                temp = nums[i] - nums[i - 1];
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        MaximumGap mg = new MaximumGap();

        int[] nums = {3, 6, 9, 1};

        int result = mg.maximumGap(nums);

        System.out.println("Maximum Gap: " + result);
    }
}
