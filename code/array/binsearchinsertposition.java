public class binsearchinsertposition {
    public int searchInsert(int[] nums, int target) {
        int si = 0;
        int ei = nums.length-1;

        while (si<=ei) {
            int mid = si+(ei-si)/2;
            if(nums[mid]==target){ return mid;}
            else if(nums[mid]<target){ si = mid+1;}
            else{ ei = mid-1;}
        }

        return si;
    }

    public static void main(String[] args) {
        binsearchinsertposition obj = new binsearchinsertposition();
        
        int[] nums = {1, 3, 5, 6};
        
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;

        System.out.println("Insert position of " + target1 + " is: " + obj.searchInsert(nums, target1));
        System.out.println("Insert position of " + target2 + " is: " + obj.searchInsert(nums, target2));
        System.out.println("Insert position of " + target3 + " is: " + obj.searchInsert(nums, target3));
    }
}
