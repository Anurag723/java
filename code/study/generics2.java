// generics with upper bound

import java.util.List;

public class generics2 {
    public static <T extends Number> void calculateNumberSum(List<T> lsT){
        double odd = 0;
        double even = 0;

        for (T t : lsT) {
            if (t.doubleValue()%2==0) {
                even += t.doubleValue();
            }
            else{
                odd += t.doubleValue();
            }
        }
        System.out.println("Even sum = "+even);
        System.out.println("Odd sum = "+odd);
    }

    public static void main(String[] args) {
        List < Integer > integers = List.of(1, 2, 3, 4, 5, 6, 7);
        List < Double > doubles = List.of(2.0, 1.5, 4.5, 2.5, 1.5);

        calculateNumberSum(integers);
        calculateNumberSum(doubles);
    }
}
