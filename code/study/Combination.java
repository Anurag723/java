import java.util.ArrayList;
import java.util.List;

public class Combination {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int start, int n, int k,
                           List<Integer> curr,
                           List<List<Integer>> res) {
        // Base case: when the combination size reaches k
        if (curr.size() == k) {
            res.add(new ArrayList<>(curr)); // copy current combination
            return;
        }

        // Try all possible next numbers
        for (int i = start; i <= n; i++) {
            curr.add(i);                 // choose
            backtrack(i + 1, n, k, curr, res); // explore
            curr.remove(curr.size() - 1); // un-choose (backtrack)
        }
    }

    public static void main(String[] args) {
        Combination c = new Combination();

        int n = 4;
        int k = 2;

        List<List<Integer>> result = c.combine(n, k);

        // Print the combinations
        for (List<Integer> comb : result) {
            System.out.println(comb);
        }
    }
}
