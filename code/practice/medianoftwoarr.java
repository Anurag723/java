import java.util.*;

public class medianoftwoarr {

    public static int[] mix(int[] arr1, int[] arr2){
        int n = 0;
        int m = 0;
        int k = 0;

        int[] res = new int[arr1.length+arr2.length];

        while (n < arr1.length && m < arr2.length) {
            if (arr1[n]<arr2[m]) {
                res[k] = arr1[n];
                n++;
            }
            else if (arr1[n]>=arr2[m]) {
                res[k] = arr2[m];
                m++;
            }

            k++;
        }

        while (n<arr1.length) {
            res[k] = arr1[n];
            n++;
            k++;
        }
        
        while (m<arr2.length) {
            res[k] = arr2[m];
            m++;
            k++;
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,4,8,7,1,5};
        int[] arr2 = {3,6,9,11,10,12};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] arr3 = mix(arr1, arr2);

        int len = arr3.length;

        if (len % 2 == 0) {
            double median = (arr3[len/2 - 1] + arr3[len/2]) / 2.0;
            System.out.println("Median is: " + median);
        }
        
        else {
            System.out.println("Median is: " + arr3[len/2]);
        }
    }
}
