import java.util.*;

public class SubsetII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        sol(0, new ArrayList<Integer>(), ans, nums);
        return ans;
    }

    private void sol(int start, List<Integer> temp, List<List<Integer>> ans, int[] nums){
        ans.add(new ArrayList<>(temp));

        for(int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i - 1]) continue; // Skip duplicates
            temp.add(nums[i]);
            sol(i + 1, temp, ans, nums);
            temp.remove(temp.size() - 1); // Backtrack
        }
    }

    public static void main(String[] args) {
        SubsetII subsetGenerator = new SubsetII();

        int[] nums = {1, 2, 2}; // Example input

        List<List<Integer>> result = subsetGenerator.subsetsWithDup(nums);

        System.out.println("Unique subsets:");
        for(List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}

