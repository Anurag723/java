public class citation {
    public static int hindex(int[] arr){
        int n = arr.length;
        int[] frequency = new int[n+1];
        
        for(int c: arr){
            if(c>n)
                frequency[n]++;
            else
                frequency[c]++;
        }
        
        
        int count = 0;
        for(int i=n;i>=0;i--){
            count=count+frequency[i];
            
            if(count>=i)
                return i;
        }
        
        return 0;
    }
    public static void main(String[] args){
        int[] arr = {5,0,2,0};

        System.out.println(hindex(arr));
    }
}
