import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class majoritynb3 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i, 0)+1);
        }

        int n = nums.length;

        for(Map.Entry<Integer, Integer> entryst:mp.entrySet()){
            if(entryst.getValue() > n/3){
                res.add(entryst.getKey());
            }
        }

        return res;
    }

    public static void main(String[] args) {
        majoritynb3 solution = new majoritynb3();

        // Example input
        int[] nums = {3, 2, 3, 2, 2, 1, 1};

        // Call the method and get result
        List<Integer> result = solution.majorityElement(nums);

        // Print the result
        System.out.println("Majority elements (> n/3 times): " + result);
    }
}
