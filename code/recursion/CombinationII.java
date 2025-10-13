import java.util.*;

public class CombinationII {
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;

        Solution solution = new Solution();
        List<List<Integer>> result = solution.combinationSum2(candidates, target);

        // Print the result
        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        sol(0, new ArrayList<>(), ans, candidates, target);
        return ans;
    }

    private void sol(int start, List<Integer> temp, List<List<Integer>> ans, int[] candidates, int target) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            if (candidates[i] > target) break;

            temp.add(candidates[i]);
            sol(i + 1, temp, ans, candidates, target - candidates[i]);
            temp.remove(temp.size() - 1);
        }
    }
}
