import java.util.*;

public class JumpGame {
    public static boolean canJump(int[] nums){
        int furthest = 0;
        for(int i=0; i<nums.length;i++){
            if(i>furthest)  return false;
            furthest = Math.max(i+nums[i], furthest);
            if(furthest>=nums.length){
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] tst = {3,2,1,0,4};
        System.out.println(canJump(tst));
    }
}
