public class inversion_count {
    public static int conquer(int arr[],int si, int mid, int ei){
        int[] merger = new int[ei-si+1];
        
        int idx1 = si;      //index of left array
        int idx2 = mid+1;   //index of right array
        
        int x= 0;
        int res = 0;
        
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merger[x] = arr[idx1];
                x++;idx1++;
            }
            
            else{
                merger[x] = arr[idx2];
                x++;idx2++;
                res += mid-idx1+1;
            }
        }
        
        while(idx1<=mid)
            merger[x++] = arr[idx1++];
            
        while(idx2<=ei)
            merger[x++] = arr[idx2++];
            
        for(int i=0;i<merger.length;i++){
            arr[si+i] = merger[i];
        }
            
        return res;
    }
    public static int divide(int arr[],int si, int ei){
        
        if(si>=ei)
            return 0;
        int mid = si+(ei-si)/2;
        
        int rsl = divide(arr,si,mid);
        int rsr = divide(arr,mid+1,ei);
        
        int res=conquer(arr,si,mid,ei);
        return res+rsl+rsr;
    }
    static int inversionCount(int arr[]) {
        // Your Code Here
        return divide(arr,0,arr.length-1);
        
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println(inversionCount(arr));;
    }
}
