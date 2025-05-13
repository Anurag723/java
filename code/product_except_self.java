public class product_except_self {
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
        int[] arr1 = pes(arr);

        for (int i : arr1) {
            System.err.print(i+" ");
        }
    }
}
