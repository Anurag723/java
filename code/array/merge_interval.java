import java.util.*;


// Time complexity O(N)
// public class merge_interval{
//     static List<int[]> mi(int[][] arr){
//         Arrays.sort(arr , (a,b) -> Integer.compare(a[0],b[0]));
//         List<int[]> res = new ArrayList<>();

//         res.add(arr[0]);
//         for (int i = 1; i < arr.length; i++) {
//             int[] end = res.get(res.size()-1);
//             int[] si = arr[i];

//             if (end[1]>=si[0]) {
//                 end[1] = Math.max(end[1],si[1]);
//             }
//             else
//                 res.add(si);
//         }
//         return res;
//     }
//     public static void main(String[] args){
//         int[][] arr = {{1,3},{2,4},{6,8},{9,10}};
//         List<int[]> res = mi(arr);

//         for (int[] is : res) {
//             for (int is2 : is) {
//                 System.err.println(is2);
//             }
//         }
//     }
// }


class merge_interval {
    public int[][] merge(int[][] intervals) {
        int max = 0;
        for (int i = 0; i < intervals.length; i++) {
            max = Math.max(intervals[i][0], max);
        }

        int[] mp = new int[max + 1];
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            mp[start] = Math.max(end + 1, mp[start]);
        }

        int r = 0;
        int have = -1;
        int intervalStart = -1;
        for (int i = 0; i < mp.length; i++) {
            if (mp[i] != 0) {
                if (intervalStart == -1) intervalStart = i;
                have = Math.max(mp[i] - 1, have);
            }
            if (have == i) {
                intervals[r++] = new int[] { intervalStart, have };
                have = -1;
                intervalStart = -1;
            }
        }

        if (intervalStart != -1) {
            intervals[r++] = new int[] { intervalStart, have };
        }
        if (intervals.length == r) {
            return intervals;
        }

        int[][] res = new int[r][];
        for (int i = 0; i < r; i++) {
            res[i] = intervals[i];
        }

        return res;
    }
}