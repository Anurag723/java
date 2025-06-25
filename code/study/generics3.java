// find target index in arr using generics
import java.util.*;

public class generics3 {
    public static <T> int idx(T[] arr1, T targeT){
        int res = -1;

        for(int i=0; i<arr1.length; i++){
            if (arr1[i] == targeT) {
                res= i;
            }
        }

        return res;
    } 

    public static void main(String[] args) {
        Integer[] arr1 = {2,5,7,5,1,6,14,8};
        System.out.println(idx(arr1, 14));
    }
}