import java.util.*;

public class find_duplicate {
    public static int rmv(int[] arr) {
        // Code Here have bugs
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            int key = set.getKey();
            int val = set.getValue();

            if (val >= 2) {
                idx = key;
            }
        }

        return idx;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,2,5,3,7,8,9};
        System.out.println(rmv(arr));
    }
}
