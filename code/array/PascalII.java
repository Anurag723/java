import java.util.*;

public class PascalII {

    // Method to compute the rowIndex-th row of Pascal's triangle
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // C(k,0) = 1

        // Use the formula:
        // C(k,i) = C(k, i-1) * (k - i + 1) / i
        for (int i = 1; i <= rowIndex; i++) {
            long prev = row.get(i - 1);  
            long next = prev * (rowIndex - i + 1) / i;  
            row.add((int) next);
        }

        return row;
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rowIndex: ");
        int rowIndex = sc.nextInt();

        List<Integer> result = getRow(rowIndex);
        System.out.println(result);
    }
}
