import java.util.*;
public class subarrayequalk{
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int count = 0; int prefix = 0;

        mp.put(0, 1);

        for(int i = 0; i<nums.length; i++){
            prefix+=nums[i];
            int remove = prefix-k;
            count+=mp.getOrDefault(remove, 0);
            mp.put(prefix,mp.getOrDefault(prefix, 0)+1);
        }

        return count;
    }
    public static void main(String[] args) {
        subarrayequalk solution = new subarrayequalk();

        int[] nums = {1, 2, 3};  // Example input
        int k = 3;

        int result = solution.subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + ": " + result);
    }
}