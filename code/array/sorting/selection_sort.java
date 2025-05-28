import java.util.*;

class selection_sort{
    static int[] sort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int min = i;

            for(int j=i+1; j<n; j++){
                if (arr[min]>arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr);
        
        for (int i : arr) {
            System.out.print(i+" ");
        }

        sc.close();
    }
}