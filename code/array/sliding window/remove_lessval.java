public class remove_lessval {
    public int removeElement(int[] nums, int val) {
        int i = 0; // pointer for position of next non-val element

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        remove_lessval sol = new remove_lessval();
        int k = sol.removeElement(nums, val);

        System.out.println("k = " + k);  // Output: 2
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");  // Output: 2 2
        }
    }
}
