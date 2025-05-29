import java.util.*;

public class remove_duplicate {
    static Set rmdp(int[] arr){
        Set st = new HashSet();

        for (Integer integer : arr) {
            st.add(integer);
        }

        return st;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,3,5,7,8,9,2,4,8,5,5,7,6};
        System.out.println(rmdp(arr));
    }
}
