import java.util.Arrays;

public class move_neg {
    public static void srt(int[] arr){
        int n = arr.length;

        int j = 0;
        for(int i=0;i<n;i++){
            if (arr[i]<0) {
                swap(arr,i,j);
                j++;
            }
        }
    }

    public static void swap(int[] arr, int lo, int hi){
        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;
    }

    public static void main(String[] main){
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        // srt(arr);
        Arrays.sort(arr);               //high tc
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
