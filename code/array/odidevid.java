public class odidevid {
    static int iddef(int[] arr){
        int eve = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                eve+=arr[i];
            }
            else{
                odd+=arr[i];
            }
        }

        return (int)Math.abs(odd-eve);
    }
    public static void main(String[] args) {
        int[] arr = {12,11,15,14,16,17,18};
        System.out.println(iddef(arr));
    }
}
