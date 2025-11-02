import java.util.*;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i = 0;
        List<int[]> res = new ArrayList<>();

        // Step 1: Add all intervals that come before the new interval
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i]);
            i++;
        }

        // Step 2: Merge all overlapping intervals
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        // Step 3: Add the merged interval
        res.add(newInterval);

        // Step 4: Add all remaining intervals
        while (i < intervals.length) {
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }

    // Optional: main method for quick testing
    public static void main(String[] args) {
        InsertInterval obj = new InsertInterval();

        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        int[][] result = obj.insert(intervals, newInterval);

        System.out.print("Merged Intervals: ");
        for (int[] interval : result) {
            System.out.print(Arrays.toString(interval) + " ");
        }
    }
}
