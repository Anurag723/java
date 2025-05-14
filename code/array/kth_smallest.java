import java.util.*;

public class kth_smallest {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = {8,5,1,5,7,6,4,9};
        Arrays.sort(arr);
        System.out.print(arr[k]+" is the result...");
        sc.close();
    }
}
