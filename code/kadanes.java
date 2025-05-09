public class kadanes {
    public static int ms(int[] arr){
        int n = arr.length;
        int cursum = arr[0];
        int maxsum = arr[0];

        for(int i=1;i<n;i++){
            cursum = Math.max(arr[i], cursum+arr[i]);
            maxsum = Math.max(maxsum, cursum);
        }

        return maxsum;
    }


    public static void main(String[] args){
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(ms(arr)+" is the max sum of arr...");
    }
}
