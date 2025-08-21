public class binarysearch {
    public int search(int[] nums, int target) {
        if(nums.length==0 || nums==null){
            return -1;
        }

        int res = -1;
        int start = 0;
        int end = nums.length-1;

        while (start<=end) {
            int mid = start+(end-start)/2;
            if (nums[mid] == target) {
                return mid;
            }

            else if(nums[mid]>target){
                end = mid-1;
            }

            else{
                start = mid+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        binarysearch bs = new binarysearch();

        int[] nums = {1, 3, 5, 7, 9, 11, 13};
        int target = 7;

        int result = bs.search(nums, target);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in array.");
        }
    }
}
