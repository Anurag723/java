public class maxbouquet {

    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)(m*k)){ return -1;}
        if(bloomDay.length==(m*k)){ return mx(bloomDay);}

        int low = Integer.MAX_VALUE;
        int high = mx(bloomDay);

        int ans = -1;

        for(int i:bloomDay){
            if (low>i) {
                low = i;
            }
        }

        while (low<=high) {
            int mid = low+(high-low)/2;

            if (canmake(bloomDay, k, m, mid)) {
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return ans;
    }

    public boolean canmake(int[] nums, int k, int m, int day){
        int boquet = 0; int flower = 0;
        for(int i:nums){
            if(i<=day){
                flower++;
                if(flower==k){
                    boquet++;
                    flower=0;
                }
            }
            else{
                flower = 0;
            }
        }

        if (boquet>=m) {
            return true;
        }
        return false;
    }

    public int mx(int[] nums){
        int max = 0;
        for(int i:nums){
            if (i>=max) {
                max = i;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        maxbouquet obj = new maxbouquet();

        int[] bloomDay = {1, 10, 3, 10, 2};
        int m = 3;
        int k = 1;

        int result = obj.minDays(bloomDay, m, k);
        System.out.println("Minimum days to make " + m + " bouquets = " + result);

        // Another test
        int[] bloomDay2 = {7, 7, 7, 7, 12, 7, 7};
        int m2 = 2, k2 = 3;
        System.out.println("Minimum days = " + obj.minDays(bloomDay2, m2, k2));
    }
}