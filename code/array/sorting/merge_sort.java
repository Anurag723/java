public class merge_sort {

    static void sort(int[]arr){
        if (arr.length < 2) {
            return; // Base case: array is already sorted
        }

        int mid = arr.length / 2;

        // Split array into two halves
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Copy data to left and right arrays
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        // Recursively sort both halves
        sort(left);
        sort(right);

        // Merge the sorted halves
        merge(left, right, arr);
    }

    // Merge two sorted arrays into one
    public static void merge(int[] left, int[] right, int[] array) {
        int i = 0, j = 0, k = 0;

        // Compare and merge elements from left and right arrays
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy any remaining elements from left
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copy any remaining elements from right
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}