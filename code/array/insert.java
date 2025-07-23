public class insert {
    public int searchInsert(int[] nums, int target) {
        int beg = 0, end = nums.length-1, mid = 0;

        while (beg<=end) {
            mid = beg+(end-beg)/2;
            if (nums[mid]==target) {
                return mid;
            }
            else if (nums[mid]<target) {
                beg = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return beg;
    }

    public static void main(String[] args) {
        insert obj = new insert();

        int[] nums = {1, 3, 5, 6};

        int target1 = 5;
        int target2 = 2;
        int target3 = 7;

        System.out.println("Target " + target1 + " -> Index: " + obj.searchInsert(nums, target1)); // Output: 2
        System.out.println("Target " + target2 + " -> Index: " + obj.searchInsert(nums, target2)); // Output: 1
        System.out.println("Target " + target3 + " -> Index: " + obj.searchInsert(nums, target3));
    }
}
