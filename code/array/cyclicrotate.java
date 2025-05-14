public class cyclicrotate {
    public static void cyclic(int[] arr){
        int n = arr.length;
        int temp = arr[n-1];

        for (int i = n-1; i >0; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {8,4,5,7,5,1,5,6,2,9};
        cyclic(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
