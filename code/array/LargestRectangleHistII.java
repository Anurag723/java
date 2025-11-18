import java.util.Stack;

public class LargestRectangleHistII {

    // Function to compute largest rectangle
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();  // will store indices
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {

            // While current bar is smaller than the bar at top of stack
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {

                int height = heights[stack.pop()];  // height of popped bar

                // If stack becomes empty, width = i
                int leftBoundary = stack.isEmpty() ? -1 : stack.peek();

                // width between leftBoundary + 1 and i - 1
                int width = i - leftBoundary - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        // Final cleanup: bars still in stack extend to the right end
        int n = heights.length;
        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int leftBoundary = stack.isEmpty() ? -1 : stack.peek();
            int width = n - leftBoundary - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }

    // Main method to test it
    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};

        int result = largestRectangleArea(heights);

        System.out.println("Largest Rectangle Area = " + result);
    }
}
