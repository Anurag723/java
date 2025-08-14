import java.util.*;

public class pascaltriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1; j<i; j++){
                long prelft = res.get(i-1).get(j-1);
                long preright = res.get(i-1).get(j);
                row.add((int)(prelft+preright));
            }
            if (i>0) {
                row.add(1);
            }
            res.add(row);
        }

        return res;
    }

    public static void main(String[] args) {
        pascaltriangle pt = new pascaltriangle();
        int numRows = 5;

        List<List<Integer>> triangle = pt.generate(numRows);

        // Print the triangle
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
