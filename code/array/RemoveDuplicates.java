import java.util.Arrays;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums){
        if(nums.length <=2 ) return nums.length;

        int res = 2;
        for (int i = 2; i < nums.length; i++) {
            if(nums[i]!=nums[res-2]){
                nums[res]=nums[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
    
            int[] nums = {1, 1, 1, 2, 2, 3};
            int len = removeDuplicates(nums);
    
            System.out.println("New length: " + len);
            System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, len)));
    
            // You can test other cases too:
            int[] nums2 = {0,0,1,1,1,1,2,3,3};
            int len2 = removeDuplicates(nums2);
            System.out.println("\nNew length: " + len2);
            System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums2, len2)));
        }
}

