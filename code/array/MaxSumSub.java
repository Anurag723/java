public class MaxSumSub{

    public static int maxSum(int[] nums){
        int res = nums[0] + nums[1];

        for(int i=1; i < nums.length-1; i++){
            res = Math.max(res ,nums[i]+nums[i+1]);
        }

        return res;
    }
    public static void main(String[] args) {
        
        int[] arr = {5, 4, 3, 1, 6};
        System.out.println(maxSum(arr));
        
    }
}