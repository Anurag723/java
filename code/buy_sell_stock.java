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

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(single(arr));
    }
}
