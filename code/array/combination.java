import java.util.*;

class combination{

    
    static void makeCombination(int[] arr, int remSum, ArrayList<Integer> cur, ArrayList<ArrayList<Integer>> res, int index) {
        

        if (remSum == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }

        
        if (remSum < 0 || index >= arr.length)
            return;
        
    
        cur.add(arr[index]);


        makeCombination(arr, remSum - arr[index], cur, res, index);


        cur.remove(cur.size() - 1);


        makeCombination(arr, remSum, cur, res, index + 1);
    }



    static ArrayList<ArrayList<Integer>> combinationSum(int[] arr, int target) {
      	Arrays.sort(arr);


        ArrayList<Integer> cur = new ArrayList<>();


        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        makeCombination(arr, target, cur, res, 0);

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int target = 8;

        ArrayList<ArrayList<Integer>> res = combinationSum(arr, target);

        for (ArrayList<Integer> v : res) {
            for (int i : v) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}