public class searchinrotated {
    public int search(int[] nums, int target){
        int si = 0;
        int ei = nums.length-1;

        while(si<=ei){
            int mid = si+(ei-si)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[si]<=nums[mid]){
                if(nums[si] <= target && target < nums[mid]){
                    ei = mid-1;
                }
                else{
                    si = mid+1;
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
        return -1;
    }
    public static void main(String[] args) {
        searchinrotated sol = new searchinrotated();

        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println("Index of " + target1 + ": " + sol.search(nums1, target1)); // Output: 4

        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println("Index of " + target2 + ": " + sol.search(nums2, target2)); // Output: -1

        int[] nums3 = {1};
        int target3 = 1;
        System.out.println("Index of " + target3 + ": " + sol.search(nums3, target3)); // Output: 0
    }
}
