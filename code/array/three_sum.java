import java.util.*;

public class three_sum {

    // optimal
    static boolean hasTripletSum(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);
        
        // Fix the first element as arr[i]
        for (int i = 0; i < n - 2; i++) {
            
            // Initialize left and right pointers with 
            // start and end of remaining subarray
            int l = i + 1, r = n - 1;
            
            int requiredSum = target - arr[i];
            while (l < r) {
                if (arr[l] + arr[r] == requiredSum)
                    return true;
                if (arr[l] + arr[r] < requiredSum)
                    l++;
                else if (arr[l] + arr[r] > requiredSum)
                    r--;
            }
        }

        // If we reach here, then no triplet was found
        return false;
    }


    // space complexity O(n) still better
    static boolean triplet1(int[] arr, int target){
        int n = arr.length;

        for (int i = 0; i < n-2; i++) {
            HashSet<Integer> st = new HashSet<>();
            for (int j = i+1; j < n; j++) {
                int second = target - arr[j] - arr[i];

                if (st.contains(second)) {
                    return true;
                }

                st.add(arr[j]);
            }
        }
        return false;
    }

    // Brute Force
    static boolean triplet(int[] arr, int target){
        int n = arr.length;

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int j2 = j+1; j2 < n; j2++) {
                    if (arr[i]+arr[j]+arr[j2]==target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int target = 13;

        System.out.println(triplet(arr, target));
        System.out.println(triplet1(arr, target));
        System.out.println(hasTripletSum(arr, target));
    }
}
