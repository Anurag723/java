

public class nextstermutation {

    static void np(int[] arr){
        int pivot = -1;
        int n = arr.length;

        for(int i = n - 2; i >= 0; i--){
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args){
        int[] arr = {2,4,1,7,5,0};
        np(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}