package code.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = solution.combinationSum(candidates, target);
        System.out.println("Combinations summing to " + target + ": " + result);
    }
}

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        sol(0, ans, new ArrayList<Integer>(), candidates, target);
        return ans;
    }

    private void sol(int start, List<List<Integer>> ans, List<Integer> temp, int[] candidate, int target){
        if (target == 0) {
            ans.add(new ArrayList<>(temp)); // Correct: deep copy to avoid mutation
            return;
        }

        if (start >= candidate.length) {
            return;
        }

        if (candidate[start] <= target) {
            temp.add(candidate[start]);
            sol(start, ans, temp, candidate, target - candidate[start]);
            temp.remove(temp.size() - 1);
        }

        sol(start + 1, ans, temp, candidate, target);
    }
}

