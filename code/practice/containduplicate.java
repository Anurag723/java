import java.util.*;

public class containduplicate {

    public static boolean condup(int[] arr){
        Set<Integer> set = new HashSet<>();
        return !(arr.length == set.size());
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1};
        boolean res = condup(arr);

        System.out.println(res);
    }
}
