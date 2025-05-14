public class product_except_self {

    static int[] pes1(int[] arr) {
        int[] ans = new int[arr.length];
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];

        int pre = 1;
        int suf = 1;

        for (int i = 0; i < arr.length; i++) {
            prefix[i] = pre;
            pre = pre * arr[i];
        }

        for (int i = suffix.length-1; i>=0; i--) {
            suffix[i] = suf;
            suf = suf*arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            ans[i] = prefix[i] * suffix[i];
        }

        return ans;
    }

    static int[] pes(int[] arr){
        int[] arr1 = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            int sum =1;
            for (int j = 0; j < arr.length; j++) {
                if(j==i){
                    continue;
                }
                else{
                    sum*=arr[j];
                }
            }
            arr1[i] = sum;
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int[] arr1 = pes1(arr);

        for (int i : arr1) {
            System.err.print(i+" ");
        }
    }
}
