public class singleele {
    public int singleNonDuplicate(int[] nums) {
        int si = 0; int ei = nums.length-1;

        while(si<ei){
            int mid = si+(ei-si)/2;

            if (mid%2==1) {
                mid-=1;
            }
            if(nums[mid] == nums[mid+1]){
                si = mid+2;
            }
            else{
                ei = mid;
            }
        }
        return si;
    }

    public static void main(String[] args) {
        singleele obj = new singleele();

        int[] nums1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] nums2 = {3, 3, 7, 7, 10, 11, 11};
        int[] nums3 = {0, 1, 1, 2, 2, 3, 3};

        System.out.println("Single element in nums1: " + obj.singleNonDuplicate(nums1)); // Output: 2
        System.out.println("Single element in nums2: " + obj.singleNonDuplicate(nums2)); // Output: 10
        System.out.println("Single element in nums3: " + obj.singleNonDuplicate(nums3)); // Output: 0
    }
}
