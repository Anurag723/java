class containwater{
    
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};  // Example input

        int maxArea = maxArea(height);  // Call the method to compute max area

        System.out.println("Maximum water that can be contained: " + maxArea);
    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;

        int maxwater = 0;
        int area = 0;

        while (left<right) {
            area = Math.min(height[left], height[right])*(right-left);
            maxwater = Math.max(maxwater, area);

            if (height[left]<=height[right]) {
                left++;
            }

            else {
                right--;
            }
        }
        return maxwater;  // Placeholder return
    }
}