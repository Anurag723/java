public class product_except_self {

    static int[] pes1(int[] arr) {
        int n = arr.length;

        // Step 1: Create output array to store the result
        int[] output = new int[n];

        // Step 2: Fill output array with left products
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            output[i] = leftProduct; // Store product of elements to the left of i
            leftProduct *= arr[i];   // Update left product for next index
        }

        // Step 3: Multiply with right products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= rightProduct; // Multiply with product of elements to the right
            rightProduct *= arr[i];    // Update right product for next index
        }

        return output;
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
