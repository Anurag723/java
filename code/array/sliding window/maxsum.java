import java.util.*;
public class maxsum {

    public static int maxsumsub(int[] arr, int k){
        int maxsu = 0;
        
        for(int i=0; i<k; i++){
            maxsu += arr[i];
        }
        
        int sum = maxsu;
        for(int i = k; i<arr.length; i++){
            sum+=arr[i]-arr[i-k];
            maxsu = Math.max(maxsu,sum);
        }
        return maxsu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(maxsumsub(arr, k));
        sc.close();
    }
}
