package sorting;

public class binary {

    static int search(int[] arr, int x){
        {
            int low = 0, high = arr.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] == x)
                    return mid;

                if (arr[mid] < x)
                    low = mid + 1;

                else
                    high = mid - 1;
            }

            return -1;
        }
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
