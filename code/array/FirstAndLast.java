public class FirstAndLast {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[]{-1, -1};

        int[] res = new int[]{-1, -1};

        // Find the first occurrence
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                res[0] = i;
                break;
            }
        }

        // If not found, return
        if (res[0] == -1) return res;

        // Find the last occurrence
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                res[1] = i;
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        FirstAndLast obj = new FirstAndLast();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = obj.searchRange(nums, target);

        System.out.println("First and Last Position of " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
}
