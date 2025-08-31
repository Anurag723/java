public class SmallestDivisor {

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;

        for(int i=0; i<nums.length; i++){
            if(high<nums[i]){
                high = nums[i];
            }
        }
        int ans = high;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(possible(nums, threshold, mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return ans;
    }

    public boolean possible(int[] nums, int threshold, int mid){
        int rem = 0;

        for(int i=0; i<nums.length; i++){
            rem+=(int)Math.ceil((double)nums[i]/mid);
        }

        if(rem<=threshold){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        SmallestDivisor sd = new SmallestDivisor();
        System.out.println(sd.smallestDivisor(nums, threshold)); // Output: 5

    }
}