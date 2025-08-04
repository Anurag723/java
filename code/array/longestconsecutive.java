// Step-by-Step Approach:
// 1-------------->Insert all elements into a HashSet for quick lookup.

// 2-------------->Initialize maxLength = 0.

// 3-------------->Iterate over each element num in the set:
//                          |
//                          ------->If num - 1 is not in the set, this is the start of a sequence.
//                                      |
// 5                                    -------->Count the length of the sequence by checking num + 1, num + 2, etc.
//                                                  
// 6-------------->Update maxLength if this sequence is longer.

// 7-------------->Return maxLength.



import java.util.*;

class longestconsecutive{
    public static int longestConsecutive(int[] nums) {
        int count = 0;
        if(nums.length==0){
            return count;
        }


        Set<Integer> st = new HashSet<>();                  //======1
        for(int i:nums){
            st.add(i);
        }

        int res = 0;                                        //======2


        for(int i:st){                                      //=======3
            if(!st.contains(i-1)){                          //=======5
                int current = i;
                count = 1;

                while(st.contains(current+1)){
                    count++;
                    current++;
                }

                res = Math.max(count, res);
            }
        }

        return res;
    }
    public static void main(String[] args){

        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int[] nums3 = {};

        System.out.println("Longest consecutive sequence length in nums1: " + longestConsecutive(nums1)); // 4
        System.out.println("Longest consecutive sequence length in nums2: " + longestConsecutive(nums2)); // 9
        System.out.println("Longest consecutive sequence length in nums3: " + longestConsecutive(nums3)); // 0
    }
}