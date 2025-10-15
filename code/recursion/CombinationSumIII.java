import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        sol(1, new ArrayList<Integer>(), ans, k, n);
        return ans;
    }

    private void sol(int start, List<Integer> temp, List<List<Integer>>ans, int k, int target){
        if(temp.size()==k && target==0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(temp.size() > k || target<0){
            return;
        }

        for(int i=start; i<10; i++){
            temp.add(i);
            sol(i+1, temp, ans, k, target-i);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        CombinationSumIII obj = new CombinationSumIII();
        int k = 3;
        int n = 7;
        List<List<Integer>> result = obj.combinationSum3(k, n);

        System.out.println("Combinations for k = " + k + ", n = " + n + ":");
        for (List<Integer> combo : result) {
            System.out.println(combo);
        }
    }
}
