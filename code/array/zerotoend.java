public class zerotoend {
    public static void moveZeroes(int[] nums) {
        int left = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                nums[left] = nums[i];
                left++;
            }
        }

        while (left<nums.length) {
            nums[left] = 0;
            left++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}