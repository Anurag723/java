public class sumexceptself {
    public static int[] sues(int[] arr){
        int[] res = new int[arr.length];

        int pre =0;
        int suf =0;

        for (int i = 0; i < arr.length; i++) {
            res[i] = pre;
            pre += arr[i];
        }

        for(int i=arr.length-1; i>=0; i--){
            res[i] = res[i]+suf;
            suf += arr[i];
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr1 = sues(arr);

        for (int i : arr1) {
            System.out.print(i+" ");
        }
    }
}
