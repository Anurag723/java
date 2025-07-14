import java.util.*;

class firstneg {

    public static List<Integer> firstng(int[] arr, int k) {
        int n = arr.length;
        Queue<Integer> que = new LinkedList<>();
        List<Integer> lst = new ArrayList<>();

        int start = 0;

        for (int end = 0; end < n; end++) {
            // Add current element to queue if it's negative
            if (arr[end] < 0) {
                que.offer(end); // store index, not value
            }

            // Window size reached
            if (end - start + 1 == k) {
                // Remove out-of-window elements from the front of the queue
                while (!que.isEmpty() && que.peek() < start) {
                    que.poll();
                }

                // Add first negative number or 0
                if (!que.isEmpty()) {
                    lst.add(arr[que.peek()]);
                } else {
                    lst.add(0);
                }

                // Slide the window
                start++;
            }
        }

        return lst;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, 15, 30, 16, 28};
        int k = 3;
        List<Integer> result = firstng(arr, k);
        System.out.println("First negatives in each window of size " + k + ": " + result);
    }
}
