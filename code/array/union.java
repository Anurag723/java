import java.util.HashSet;

public class union {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8,9};

        HashSet<Integer> arr = new HashSet<>();
        for (int i : arr1) {
            arr.add(i);
        }

        for (int i : arr2) {
            arr.add(i);
        }

        for (Integer i : arr) {
            System.out.print(i+" ");
        }
    }
}
