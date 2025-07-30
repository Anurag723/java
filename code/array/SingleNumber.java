public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR each number
        }
        return result;
    }

    // Example usage
    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        System.out.println(sn.singleNumber(new int[]{2, 2, 1})); // Output: 1
        System.out.println(sn.singleNumber(new int[]{4, 1, 2, 1, 2})); // Output: 4
        System.out.println(sn.singleNumber(new int[]{1})); // Output: 1
    }
}
