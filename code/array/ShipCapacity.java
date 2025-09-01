public class ShipCapacity {
    public int shipWithinDays(int[] weights, int days) {
        int low = 1;
        int high = 0;

        for(int i:weights){
            high+=i;
        }

        int ans = -1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(possible(weights, days, mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return ans;
    }

    public boolean possible(int[] weights, int days, int curr){
        int sum = 0; int count = 1;

        for(int i=0; i<weights.length; i++){
            if(weights[i]>curr){
                return false;
            }

            if(sum+weights[i]<=curr){
                sum+=weights[i];
            }

            else{
                count++;
                sum = weights[i];
            }
        }

        
        if(count<=days){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ShipCapacity sc = new ShipCapacity();

        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;

        int result = sc.shipWithinDays(weights, days);
        System.out.println("Minimum ship capacity to ship within " + days + " days is: " + result);
    }

}
