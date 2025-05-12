import java.util.*;

public class twosum{
    static int[] ts(int[] arr, int target){
        
        int[] res = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (mp.containsKey(target-a)) {
                res[0] = a;
                res[1] = target-a;
            }
            else
                mp.put(a, 1);
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {2,6,5,8,11};
        int target = 14;

        int[] res = ts(arr, target);

        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}