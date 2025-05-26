import java.util.*;


// perfect squareroot using binary search
class perfectsqroot{
    static int sqrt(int num){
        if (num < 0) return -1;
        if (num == 0 || num == 1) return num;


        int si = 1;
        int end = num/2;

        while (si<=end) {
            int mid = si+(end-si)/2;
            long square = mid*mid;

            if (square==num) {
                return mid;
            }
            else if (square<num) {
                si++;
            }
            else{
                end--;
            }
        }
        return -1;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sqrt(n));
        sc.close();
    }
}