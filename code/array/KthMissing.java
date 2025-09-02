class KthMissing{
    public int findKthPositive(int[] arr, int k) {
        int low = 0; int high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int asumedmissing = arr[mid]-mid-1;
            if(asumedmissing<k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return low+k;
    }
    public static void main(String[] args){
        KthMissing obj = new KthMissing();

        // Example 1
        int[] arr1 = {2, 3, 4, 7, 11};
        int k1 = 5;
        System.out.println("Output 1: " + obj.findKthPositive(arr1, k1));  // Expected: 9

        // Example 2
        int[] arr2 = {1, 2, 3, 4};
        int k2 = 2;
        System.out.println("Output 2: " + obj.findKthPositive(arr2, k2));  // Expected: 6

        // Example 3
        int[] arr3 = {5, 6, 8, 9};
        int k3 = 4;
        System.out.println("Output 3: " + obj.findKthPositive(arr3, k3));  // Expected: 4
    }
}