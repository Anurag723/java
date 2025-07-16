import java.util.*;

class medianofsorted{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int beg = 0;
        int end = m;
        if (m>n) return findMedianSortedArrays(nums2, nums1);

        while (beg<=end) {
            int i1 = (beg+end)/2;
            int i2 = (n+m+1)/2-i1;

            int l1 = (i1==m)?Integer.MAX_VALUE:nums1[i1];
            int l2 = (i2==n)?Integer.MAX_VALUE:nums2[i2];

            int m1 = (i1==0)?Integer.MIN_VALUE:nums1[i1-1];
            int m2 = (i2==0)?Integer.MIN_VALUE:nums2[i2-1];

            if (m1<l2 && m2<l1) {
                if ((m+n)%2==0) {
                    return (double)(Math.max(m2, m1)+Math.min(l1,l2))/2;
                }
                else{
                    return (double)(Math.max(m2, m1));
                }
            }
            else if (l1>m2) {
                end = i1-1;
            }else{
                beg = i1+1;
            }
        }

        return 0.0;
    }

    public static void main(String[] args){
        int[] arr1 = {1,3,5,6,8,9,11,12};
        int[] arr2 = {2,4,7,10};

        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}