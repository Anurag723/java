import java.util.*;

public class overlapping {
    public static List<int[]> mergeOverlap(int[][] arr) {
        // Code here // Code here
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));
        
        List<int[]> res = new ArrayList<>();
        res.add(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            int[] last = res.get(res.size()-1);
            int[] count = arr[i];
            
            if(last[1]>=count[0])
                last[1] = Math.max(count[1],last[1]);
            
            else
                res.add(count);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{7, 8}, {1, 5}, {2, 4}, {4, 6}};
        List<int[]> res = mergeOverlap(arr);

        for (int[] interval : res) 
            System.out.println(interval[0] + " " + interval[1]);
    }
}
