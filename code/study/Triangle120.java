import java.util.*;

public class Triangle120 {

    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) return 0;

        int n = triangle.size();

        // Bottom-up DP
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int minBelow = Math.min(
                        triangle.get(i + 1).get(j),
                        triangle.get(i + 1).get(j + 1)
                );
                triangle.get(i).set(j, triangle.get(i).get(j) + minBelow);
            }
        }

        return triangle.get(0).get(0);
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        int result = minimumTotal(triangle);
        System.out.println("Minimum path sum: " + result); // Expected: 11
    }
}
