import java.util.*;

class firstneg{

    public static List<Integer> firstng(int[] arr, int k){
        int n = arr.length;
        Queue<Integer> que = new LinkedList<>();
        List<Integer> lst = new ArrayList<>();
        int index = 0;

        for(int i=0; i < arr.length; i++){
            if (arr[i]<0) {
                que.offer(arr[i]);
            }

            if (i-index==k-1) {
                if (!que.isEmpty()) {
                    lst.add(que.poll());
                }

                else{
                    lst.add(0);
                }
            }
            index++;
        }
        return lst;
    }

    public static void main(String[] args){
        int[] arr = {12, -1, -7, 8, 15, 30, 16, 28};
        int k = 3;
        System.out.println(firstng(arr, k));
    }
}