import java.util.*;

class jumpSearch{
    static int search(int[] arr, int target) {
        int n = arr.length;
        int step = (int)Math.sqrt(n);
        int prev = 0;

        // Jump phase
        while (prev < n && arr[Math.min(step, n)-1] < target) {
            prev = step;
            step += (int)Math.sqrt(n);
            if (prev >= n)
                return -1;
        }

        // Linear search phase
        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,7,8,9,1,2,3,6};
        Arrays.sort(arr);
        int res = search(arr,8);
        if (res>=0) {
            System.out.println("found at "+res);
        }
        else
            System.out.println("Not Found");
    }
}