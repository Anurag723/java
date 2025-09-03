public class SplitArrayMaxSum {
    public int splitArray(int[] nums, int k) {
        if(nums.length<k) return -1;
        int low =0 ;
        int high = 0;

        for(int i:nums){
            if(low<i){
                low = i;
            }

            high += i;
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            if(possible(nums, mid, k)){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return high+1;
    }

    public boolean possible(int[] nums, int mid, int k){
        int presum = 0; int sum = 1;

        for(int i=0; i<nums.length; i++){
            if(presum+nums[i]>mid){
                sum+=1;
                presum = nums[i];

                if(sum>k) return false;
            }
        }

        return true;
    }

    
    public static void main(String[] args) {
        SplitArrayMaxSum solution = new SplitArrayMaxSum();

        int[] nums = {7, 2, 5, 10, 8};  // Example input
        int k = 2;                      // Number of subarrays

        int result = solution.splitArray(nums, k);

        System.out.println("Minimum largest subarray sum: " + result);
    }
}

