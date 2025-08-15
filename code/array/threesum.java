import java.util.*;

public class threesum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for(int i = 0; i<n-2; i++){
            
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i+1;
            int right = n-1;

            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        threesum solver = new threesum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = solver.threeSum(nums);
        
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
