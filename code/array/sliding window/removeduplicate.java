import java.util.*;

public class removeduplicate {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // slow pointer

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1; // number of unique elements
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3};

        var sol = new removeduplicate();
        int k = sol.removeDuplicates(nums);

        System.out.println("Unique count: " + k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}