public class quick_sort {
    static int[] sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            sort(arr, low, pivot - 1); // for left side sort
            sort(arr, pivot + 1, high);
        }
        return arr;
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = high; // first let pivot be last element
        int i = low - 1; // put the sort values before low suppose if low =0 then value be at -1 which in
                         // the end will be corrected when we do i+1 return putting all at correct place.


        // Traverse arr[low..high] and move all smaller
        // elements to the left side. Elements from low to 
        // i are smaller after every iteration

        for(int j = low; j<high; j++){
            if (arr[pivot]>arr[j]) {
                i++;
                swap(arr,j,i);
            }
        }

        swap(arr, i+1, high);            //since loop check for less then high;
        return i+1;

    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
