import java.util.*;

class altposneg {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Step 1: Separate the numbers into positives and negatives
        for (int num : nums) {
            if (num > 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        int n = nums.length;
        int[] res = new int[n];

        // Step 2: Build result array with alternating signs
        int i = 0, p = 0, ne = 0;
        while (i < n) {
            if (i % 2 == 0) {
                res[i++] = pos.get(p++);
            } else {
                res[i++] = neg.get(ne++);
            }
        }

        return res;
    }

    // For testing
    public static void main(String[] args) {
        altposneg sol = new altposneg();
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] result = sol.rearrangeArray(nums);

        System.out.println(Arrays.toString(result));
    }
}
