package sorting;

public class binary {

    static int search(int[] arr, int x){
        {
            int low = 0, high = arr.length - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;

                // Check if x is present at mid
                if (arr[mid] == x)
                    return mid;

                // If x greater, ignore left half
                if (arr[mid] < x)
                    low = mid + 1;

                // If x is smaller, ignore right half
                else
                    high = mid - 1;
            }

            // If we reach here, then element was
            // not present
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
