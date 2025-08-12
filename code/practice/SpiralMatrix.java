package code.practice;

import java.util.*;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        if (matrix == null || matrix.length == 0) return res;

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            if (top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    res.add(matrix[i][right]);
                }
                right--;
            }

            if (top <= bottom && left <= right) {
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right && top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9,10,11,12},
                       {13,14,15,16}};
        System.out.println(spiralOrder(arr));
    }
}
