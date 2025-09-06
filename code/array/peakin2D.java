class peakin2D{
    public static int[] findPeakGrid(int[][] mat) {
        int row = mat.length-1;
        int col = mat[0].length-1;

        int si = 0;
        int ei = col-1;

        while (si<ei) {
            int mid = si+(ei-si)/2;
            int maxrowval = 0;
            for(int i = 0; i<=row; i++){
                if(mat[i][mid]>mat[maxrowval][mid]){
                    maxrowval = i;
                }
            }

            boolean left = mid>0 && mat[maxrowval][mid-1]>mat[maxrowval][mid];
            boolean right = mid<col && mat[maxrowval][mid+1]>mat[maxrowval][mid];

            if(!left && !right){
                return new int[]{maxrowval,mid};
            }
            else if(left){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {10, 8, 10, 10},
            {14, 13, 12, 11},
            {15, 9, 11, 21},
            {16, 17, 19, 20}
        };

        int[] result = findPeakGrid(mat);
        if (result != null) {
            System.out.println("Peak found at: [" + result[0] + ", " + result[1] + "] with value: " + mat[result[0]][result[1]]);
        } else {
            System.out.println("No peak found.");
        }
    }
}