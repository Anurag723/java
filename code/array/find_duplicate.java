

public class find_duplicate {
    public static int rmv(int[] arr) {
        // Code Here have bugs
        if(arr.length<=1)
            return arr.length;
            
        int idx = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1])
                arr[idx++] = arr[i];
        }
        
        return idx;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,2,5,3,7,8,9};
        System.out.println(rmv(arr));
    }
}
