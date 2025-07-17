package string;

import java.util.*;

public class topkelem {
    public int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> rsmp = new HashMap<>();
        for (int i : nums) {
            rsmp.put(i, rsmp.getOrDefault(i, 0)+1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(rsmp.entrySet());
        entryList.sort((a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entryList.get(i).getKey();
        }

        return result;
    }

    public static void main(String[] args) {
        
        topkelem solution = new topkelem();

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] topK = solution.topKFrequent(nums, k);

        System.out.println("Top " + k + " frequent elements:");
        for (int num : topK) {
            System.out.println(num);
        }
    }
}
