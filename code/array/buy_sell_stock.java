public class buy_sell_stock {
    // for single transactions
    static int single(int[] arr){
        
        int max = 0;
        int min = 0;

        for (int j = 0; j < arr.length; j++){
            if (arr[min]>=arr[j]) {
                min = j;
            }
            max = Math.max(max, arr[j]-arr[min]);

        }
        return max;
    }

    // for multiple
    static int multiple(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i>0 && arr[i-1]<arr[i]) {
                sum+=arr[i]-arr[i-1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(multiple(arr));
    }
}
