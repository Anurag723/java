package string;

public class BeautyOptimised {
    public int beautySum(String s){
        int res = 0;

        for(int i=0; i<s.length(); i++){
            int[] arr = new int[26];

            for(int j=i; j<s.length(); j++){
                arr[s.charAt(j)-'a']++;

                int maxfreq = 0;
                int minfreq = Integer.MAX_VALUE;
                
                for(int f:arr){
                    if (f>0) {
                        maxfreq = Math.max(maxfreq, f);
                        minfreq = Math.min(f, minfreq);
                    }
                }
                res+=maxfreq-minfreq;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        BeautyofSubstring bos = new BeautyofSubstring();
        String input = "aabcb";
        int result = bos.beautySum(input);
        System.out.println("Total beauty of all substrings: " + result);
    }
}
