import java.util.*;

//use generics method to check if two arrays are equal and same

public class generics1 {

    public static <T> boolean isEqual(T[] arr1, T[] arr2){
        if (arr1.length != arr2.length) {
            return false;
        }

        for(int i=0; i<arr1.length; i++){
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Integer[] arr1 = {2,4,6,8};
        Integer[] arr2 = {1,3,5,7};

        System.out.println(isEqual(arr1, arr2));
    }
}