import java.util.*;

public class sqrtforall {
    static double sqrt(int num){
        if (num < 0) return -1;
        if (num == 0 || num == 1) return num;
        int si = 0;
        int end = num;
        double res = 0;

        while (si<=end) {
            int mid = si+(end-si)/2;
            long sqr = mid*mid;

            if(mid*mid==num){
                return mid;
            }
            else if (sqr<num){ 
                si = mid+1;
                res = mid;
            }
            else{
                end = mid-1;
            }
        }

        double incr = 0.1;
        for(int i = 0; i<3; i++) {
            while(res*res<=num){
                res+=incr;
            }
            res-=incr;
            incr/=10;

        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sqrt(num));
        sc.close();
    }
}
