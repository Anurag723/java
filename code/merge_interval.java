import java.util.*;

public class merge_interval{
    static List<int[]> mi(int[][] arr){
        Arrays.sort(arr , (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();

        res.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int[] end = res.get(res.size()-1);
            int[] si = arr[i];

            if (end[1]>=si[0]) {
                end[1] = Math.max(end[1],si[1]);
            }
            else
                res.add(si);
        }
        return res;
    }
    public static void main(String[] args){
        int[][] arr = {{1,3},{2,4},{6,8},{9,10}};
        List<int[]> res = mi(arr);

        for (int[] is : res) {
            for (int is2 : is) {
                System.err.println(is2);
            }
        }
    }
}