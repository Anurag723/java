// add two lists alternatly to list using generics

import java.util.ArrayList;
import java.util.List;

public class generics5 {
    public static <T> List<T> addlst(List<T> arr1, List<T> arr2){
        List<T> res = new ArrayList<>();
        int maxsize = Math.max(arr1.size(), arr2.size());

        for(int i=0; i<maxsize; i++){

            if (i<arr1.size()) {
                res.add(arr1.get(i));
            }

            if (i<arr2.size()) {
                res.add(arr2.get(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> arr1 = List.of(1,3,5,7,9);
        List<Integer> arr2 = List.of(2,4,6,8);

        System.out.println(addlst(arr1, arr2));
    }
}
