import java.util.*;

public class twosum{

    // two sum two pointer approach
    static int[] tstp(int[] arr, int target){

        int left = 0;
        int right = arr.length-1;


        int[] ans = new int[2];

        while (left<right) {
            if (arr[left]+arr[right] == target) {
                ans[0] = arr[left];
                ans[1] = arr[right];
                return ans;
            }

            else if (arr[left]+arr[right] < target) {
                left++;
            }

            else if (arr[left]+arr[right] > target) {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    // tc = O(NlogN)


    static int[] ts(int[] arr, int target){
        
        int[] res = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            if (mp.containsKey(target-a)) {
                res[0] = a;
                res[1] = target-a;
            }
            else
                mp.put(a, 1);
        }
        return res;
    }


    // using greedy approach with pointer for left and right

    static int[] ts1(int[] arr, int target){
        int[] res = new int[2];
        int left = 0;
        int right = arr.length-1;

        while (left<right) {
            if (arr[left]+arr[right]==target) {
                res[0] = arr[left];
                res[1] = arr[right];
                return res;
            }

            else if(arr[left]+arr[right]<target){
                left++;
            }
            else if (arr[left]+arr[right]>target) {
                right--;
            }
        }

        return res;
    }
    public static void main(String[] args){
        int[] arr = {2,6,5,8,11};
        int target = 14;
        Arrays.sort(arr);

        int[] res = tstp(arr, target);

        for (int i : res) {
            System.out.print(i+" ");
        }
    }
}