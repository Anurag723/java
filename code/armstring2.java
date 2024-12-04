// other than string
import java.util.*;

public class armstring2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (m>0) {
            arr.add(m%10);
            m = m/10;
        }
        for (Integer integer : arr) {
            sum=sum+(int)(Math.pow(integer,arr.size()));
        }
        if(sum==n){
            System.out.println("armstrong");
        }
        sc.close();
    }
}
