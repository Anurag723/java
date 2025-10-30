public class JumpGameII {

    public int jump(int[] nums) {
        int jump = 0;
        int end = 0;
        int furthest = 0;

        for(int i=0; i<n-1; i++){
            furthest = Math.max(furthest, i+nums[i]);

            if(end==i){
                jump++;
                end = furthest;
            }
        }
    }

    public static void main(String[] args) {
        JumpGameII solution = new JumpGameII();

        int[] nums1 = {2, 3, 1, 1, 4};
        int[] nums2 = {2, 3, 0, 1, 4};
        int[] nums3 = {1, 2, 1, 1, 1};

        System.out.println("Minimum jumps for [2,3,1,1,4]: " + solution.jump(nums1)); // Expected: 2
        System.out.println("Minimum jumps for [2,3,0,1,4]: " + solution.jump(nums2)); // Expected: 2
        System.out.println("Minimum jumps for [1,2,1,1,1]: " + solution.jump(nums3)); // Expected: 3
    }
}