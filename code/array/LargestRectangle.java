import java.util.Stack;

public class LargestRectangle {

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int index = 0;

        while (index < heights.length) {
            // If the current bar is higher than the bar at stack top, push it to the stack
            if (stack.isEmpty() || heights[index] >= heights[stack.peek()]) {
                stack.push(index++);
            } else {
                // Pop the top
                int topOfStack = stack.pop();
                // Calculate the area with heights[topOfStack] as the smallest (or minimum height) bar 'h'
                int area = heights[topOfStack] * (stack.isEmpty() ? index : index - stack.peek() - 1);
                // Update maxArea, if needed
                maxArea = Math.max(maxArea, area);
            }
        }

        // Now, pop the remaining bars from stack and calculate area
        while (!stack.isEmpty()) {
            int topOfStack = stack.pop();
            int area = heights[topOfStack] * (stack.isEmpty() ? index : index - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println("Maximum area: " + largestRectangleArea(heights));  // Output: 10
    }
}
