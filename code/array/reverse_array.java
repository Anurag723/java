// import java.util.*;

class reverse_array{
    public static int[] rev(int[] arr){
        int temp = 0;
        for(int i=0;i<arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        rev(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}