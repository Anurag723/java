import java.util.*;

public class besttimetobuy {

    public static int btbs(int[] arr){
        int minprice = arr[0];
        int maxprofit = 0;

        for(int i:arr){
            minprice = Math.min(minprice, i);
            maxprofit = Math.max(maxprofit, i-minprice);
        }

        return maxprofit;
    }
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,2,1};
        int res = btbs(arr);

        System.out.println(res);
    }
}
