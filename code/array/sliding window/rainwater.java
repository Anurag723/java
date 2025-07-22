public class rainwater {
    public static int trap(int[] height){
        if (height.length == 0) return 0;

        int n = height.length;
        int left = 0 , right = n-1;
        int res = 0;
        int curr = 0;

        while (left<right) {
            curr = Math.min(height[left], height[right])*(right-left);
            res = Math.max(res, curr);
            if (height[left]<=height[right]) {
                left++;
            }
            else{
                right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = trap(height); // trap is your function that solves the problem
        System.out.println(result); // Expected output: 6
    }
}
