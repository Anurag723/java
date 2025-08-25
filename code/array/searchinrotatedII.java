public class searchinrotatedII{
    public boolean search(int[] nums, int target){
        int si = 0;
        int ei = nums.length-1;

        while(si<=ei){
            int mid = si+(ei-si)/2;

            if(nums[mid]==target){
                return true;
            }

            if(nums[si]<=nums[mid]){
                if (nums[si]<=target && target<nums[mid]) {
                    ei = mid-1;
                }
                else{
                    si=mid+1;
                }
            }

            else{
                if(nums[mid]<target && target<=nums[ei]){
                    si = mid+1;
                }
                else{
                    ei = mid-1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        searchinrotatedII obj = new searchinrotatedII();

        int[] nums1 = {2, 5, 6, 0, 0, 1, 2};
        int target1 = 0;

        int[] nums2 = {2, 5, 6, 0, 0, 1, 2};
        int target2 = 3;

        System.out.println("Search target " + target1 + " in nums1: " + obj.search(nums1, target1));
        System.out.println("Search target " + target2 + " in nums2: " + obj.search(nums2, target2));
    }
}