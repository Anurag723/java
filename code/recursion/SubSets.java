// package code.recursion;

import java.util.*;

public class SubSets {

    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        sol(0, new ArrayList<Integer>(), ans, nums);
        return ans;
    }

    private static void sol(int start, List<Integer> curr, List<List<Integer>> ans, int[] nums){
        ans.add(new ArrayList<Integer>(curr));

        for(int i=start; i<nums.length; i++){
            curr.add(nums[i]);
            sol(i+1, curr, ans, nums);
            curr.remove(curr.size()-1);
        }
    }
    

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subsets(nums);
        
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}