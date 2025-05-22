//package sorting;

public class LinearSearch {

    static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,7,8,4,9,6,3};
        int res = search(arr,7);
        if (res>=0) {
            System.out.println("found at "+res);
        }
        else
            System.out.println("Not Found");
    }
}