// reverse a generic list

import java.util.*;

class generics4{

    public static <T> List<T> rev(List<T> arr){
        List<T> res = new ArrayList<>();
        for(int i = arr.size()-1; i>=0;i--){
            res.add(arr.get(i));
        }
        return res;
    }
    public static void main(String[] args) {
        List<String> arr = List.of("RED", "Blue", "GREEN");
        List<String> res = rev(arr);

        System.out.println(res);
    }
}