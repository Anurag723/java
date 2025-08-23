public class firstlstbinsearch{
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};

        if(nums.length==0 || nums==null){
            return res;
        }

        res[0] = occurfst(nums, target);
        res[1] = occurlst(nums, target);

        return res;
    }

    private int occurfst(int[] nums, int target){
        int si = 0;
        int ei = nums.length-1;

        int res = -1;

        while(si<=ei){
            int mid = si+(ei-si)/2;

            if(nums[mid] == target){
                res = mid;
                ei = mid-1;
            }else if(nums[mid]<target){
                si = mid+1;
            }
            else{
                ei = mid-1;
            }
        }
        return res;
    }

    private int occurlst(int[] nums, int target){
        int si = 0;
        int ei = nums.length-1;

        int res = -1;

        while(si<=ei){
            int mid = si+(ei-si)/2;

            if(nums[mid] == target){
                res = mid;
                si = mid+1;
            }else if(nums[mid]<target){
                si = mid+1;
            }
            else{
                ei = mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        firstlstbinsearch obj = new firstlstbinsearch();

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = obj.searchRange(nums, target);

        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }
}