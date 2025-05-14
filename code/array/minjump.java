// import java.util.*;

public class minjump{
    public static boolean mj(int[] arr){
        int minidx = 0;
        for(int i=0;i<arr.length;i++){
            if (i>minidx) {
                return false;
            }
            minidx = Math.max(minidx,arr[i]+i);
        }
        return true;
    }
    public static void main(String[] args){
        int[] arr = {3,2,1,7};
        System.out.println(mj(arr));
    }
}