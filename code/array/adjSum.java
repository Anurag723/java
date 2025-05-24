import java.util.*;

public class adjSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int idx = sc.nextInt();

        int res = 0;
        
        if (n!=0) {
            if (idx==0) {
                res = Math.abs((arr[idx+1]-arr[idx]));
            }
            else if (idx==(n-1)) {
                res = Math.abs((arr[idx]-arr[idx-1]));
            }
            else{
                res = Math.abs(((arr[idx]-arr[idx-1]))+Math.abs((arr[idx+1]-arr[idx])));
            }
        }

        System.out.println(res);
        sc.close();
   }
}
