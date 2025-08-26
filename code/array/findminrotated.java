public class findminrotated{
    public int findMin(int[] nums) {
        int si = 0;
        int ei = nums.length-1;

        while(si<ei){
            int mid = si+(ei-si)/2;

            if(nums[mid]<nums[ei]){
                ei = mid;
            }

            else{
                si = mid+1;
            }
        }

        return nums[si];
    }
    public static void main(String[] args) {
        findminrotated obj = new findminrotated();

        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums2 = {3, 4, 5, 1, 2};
        int[] nums3 = {11, 13, 15, 17};
        int[] nums4 = {2, 3, 4, 5, 6, 7, 1};

        System.out.println("Minimum in nums1: " + obj.findMin(nums1)); // Output: 0
        System.out.println("Minimum in nums2: " + obj.findMin(nums2)); // Output: 1
        System.out.println("Minimum in nums3: " + obj.findMin(nums3)); // Output: 11
        System.out.println("Minimum in nums4: " + obj.findMin(nums4)); // Output: 1
    }
}