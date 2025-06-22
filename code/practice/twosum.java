import java.util.*;

class twosum{
    public static boolean twsmusngset(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(target-arr[i])) {
                return true;
            }

            set.add(arr[i]);
        }

        return false;
    }
    public static boolean twsmusngarr(int[] arr, int target){
        int lft = 0;
        int right = arr.length-1;

        while (lft<=right) {
            if (arr[lft]+arr[right]==target) {
                return true;
            }
            lft++;
            right--;
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {2,7,8,9,11};
        int target = 13;

        System.out.println(twsmusngset(arr,target));
        System.out.println(twsmusngarr(arr,target));
    }
}