//practice predicates in java generics...
import java.util.*;
import java.util.function.Predicate;


class generics7{
    public static <T extends Number> List<T> pre(List<T> num, Predicate <T> predicate){
        List<T> res = new ArrayList<>();

        for (T t : num) {
            if (predicate.test(t)) {
                res.add(t);
            }
        }

        return res;
    }
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> res = pre(num, n-> n%2==0);

        System.out.println("finding even from :-"+num+"using predicate and the result is "+res);
    }
}