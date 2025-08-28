public class squareusingbinsearch{
    static int floorSqrt(int n){
        int si = 1;
        int ei = n;

        int res = 1;

        while(si<=ei){
            int mid = si+(ei-si)/2;
            if (mid*mid<=n) {
                res = mid;
                si = mid+1;
            }
            

            else{
                ei = mid-1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(floorSqrt(n));
    }
}