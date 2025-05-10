import java.util.*;
public class findduplicate {
    public static List<Integer> fd(int[] arr){
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> res1 = new HashMap<>();
        for (int i : arr) {
            res1.put(i,res1.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer,Integer> ent : res1.entrySet()) {
            int key = ent.getKey();
            int val = ent.getValue();

            if (val>1) {
                res.add(key);
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {3,2,1,7,1,7,5};
        System.out.println(fd(arr));
    }
}
