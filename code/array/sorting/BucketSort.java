
import java.util.*;

public class BucketSort {
    public static void bucketSort(float[] arr) {
        int n = arr.length;
        if (n <= 0)
            return;


        @SuppressWarnings("unchecked")
        List<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        
        for (float num : arr) {
            int bucketIndex = (int)(num * n);
            buckets[bucketIndex].add(num);
        }

        
        
        for (List<Float> bucket : buckets) {
            Collections.sort(bucket); 
        }


        int index = 0;
        for (List<Float> bucket : buckets) {
            for (float num : bucket) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.897f, 0.565f, 0.656f, 0.123f, 0.665f, 0.343f};
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
