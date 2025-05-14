import java.util.*;

public class max_min {
    public static void main(String[] args){
        int[] arr = {8,4,5,1,8,5,4,85,9};
        Arrays.sort(arr);
        System.out.print("min:-" + arr[0] + "    max:-" + arr[arr.length-1]);
    }
}