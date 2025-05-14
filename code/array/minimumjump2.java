public class minimumjump2 {
    
    static int minJumps(int[] arr){
        int n = arr.length;
        int res = 0;
        int curr = 0;
        int max = 0;

        if (arr.length<=1) {
            return 0;
        }

        if (arr[0]==0) {
            return-1;
        }

        for(int i=0; i<n; i++){
            max = Math.max(max,i+arr[i]);
            if (i==curr) {
                res++;
                curr = max;
            }
            if (curr>=n-1) {
                break;
            }
        }
        if (curr>=n-1) {
            return res;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));
    }
}

