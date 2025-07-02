import java.util.*;
// code for next greatest array using stack
public class practice {
    public static int[] findnextgrt(int[] arr){
        int n = arr.length;
        Stack<Integer> stc = new Stack<>();
        int[] res = new int[n];

        for (int i = n-1; i >= 0; i--) {
            while (!stc.isEmpty() && stc.peek()<arr[i]) {
                stc.pop();
            }

            res[i] = stc.isEmpty()?-1:stc.peek();

            stc.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,7,8,9,12};
        int[] res = findnextgrt(arr);

        for (int i : res) {
            System.out.print(i + "->");
        }
        System.out.println("null;");
    }
}
