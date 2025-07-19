import java.util.*;

class threesumclose{
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0]+nums[1]+nums[3];

        for(int i=0; i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;

            while (left<right) {
                int sum = nums[i]+nums[left]+nums[right];

                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                else if (sum==target) {
                    return sum;
                }

                if (sum<target) {
                    left++;
                }
                else{
                    right--;
                }
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        int result = threeSumClosest(nums, target);
        System.out.println("Closest sum to target is: " + result);
    }
}