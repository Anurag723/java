public class Searchin2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int low = 0;
        int high = row*col-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(matrix[mid/col][mid%col]==target){
                return true;
            }

            if(matrix[mid/col][mid%col]>target){
                high = mid-1;
            }

            else{
                low = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Searchin2D solution = new Searchin2D();

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target1 = 3;
        int target2 = 13;

        System.out.println("Searching for 3: " + solution.searchMatrix(matrix, target1));  // true
        System.out.println("Searching for 13: " + solution.searchMatrix(matrix, target2)); // false
    }
}
