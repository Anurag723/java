import java.util.Arrays;

public class merge_sorted{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j>=0){
            if (nums1[i]>=nums2[j]) {
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }

        while(j>=0){
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        int m = 3, n = 3;

        merge_sorted merger = new merge_sorted();
        merger.merge(nums1, m, nums2, n);

        System.out.println("Merged array: " + Arrays.toString(nums1));
    }

}