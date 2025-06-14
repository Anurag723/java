import java.util.*;

class secondlargest{
    public static void main(String[] args) {
        int[] arr = {2,5,6,9,8};

        Arrays.sort(arr);

        System.out.println(arr[arr.length-2]);
    }

}