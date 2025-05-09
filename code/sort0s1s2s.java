// import java.util.*;
public class sort0s1s2s {
    public static void srt(int[] arr){
        int n = arr.length;

        int lo = 0;
        int mid = 0;
        int hi = n-1;

        while (mid<=hi) {
            if (arr[mid]==0) {
                swap(arr,lo,mid);
                lo++;
                mid++;
            }

            else if (arr[mid]==1) {
                mid++;
            }

            else{
                swap(arr,mid,hi);
                hi--;
            }
        }
    }

    public static void swap(int[] arr, int lo, int hi){
        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;
    }

    public static void main(String[] args){
        int[] arr = {0,2,1,0,0,1,0,2,2,2,1,0,2};
        srt(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}