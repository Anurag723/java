import java.util.*;

public class PermutationII {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};

        PermutationII solution = new PermutationII();
        List<List<Integer>> result = solution.permuteUnique(nums);

        System.out.println("Unique permutations:");
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        sol(res, used, new ArrayList<Integer>(), nums);
        return res;
    }

    private void sol(List<List<Integer>> res, boolean[] used, List<Integer> temp, int[] nums){
        if(temp.size()==nums.length) res.add(new ArrayList<>(temp));

        for(int i=0; i<nums.length; i++){
            if(used[i]) continue;
            if(i>0 && nums[i]== nums[i-1] && !used[i-1]) continue;
            
            used[i]=true;
            temp.add(nums[i]);
            sol(res, used, temp, nums);
            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }
}
