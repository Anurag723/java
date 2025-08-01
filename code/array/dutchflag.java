public class dutchflag {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};

        sortColors(nums);

        // Print sorted array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    // Swap nums[low] and nums[mid]
                    int temp0 = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp0;
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    // Swap nums[mid] and nums[high]
                    int temp2 = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp2;
                    high--;
                    break;
            }
        }
    }
}
