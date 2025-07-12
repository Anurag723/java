// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;


class large<T extends Comparable<T>>{
    private T[] arr;
    
    large(T[] arr){
        this.arr = arr;
    }
    
    T result(){
        T max = arr[0];
        
        for(T t:arr){
            if (t.compareTo(max)>0)
                max = t;
        }
        
        return max;
    }
}

class generics8{
    public static void main (String[] args) {
        Integer[] arr = {3, 5, 2, 10, 6};
        String[] arr1 = {"apple", "banana", "pears"};
        
        large<Integer> res1 = new large<>(arr);
        large<String> res2 = new large<>(arr1);
        
        System.out.println(res1.result());
        System.out.println(res2.result());
    }
}