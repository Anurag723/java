public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        sol(res, new ArrayList<Integer>(), nums);
        return res;
    }

    private void sol(List<List<Integer>> res, List<Integer> temp, int[] nums){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
        }

        for(int i=0; i<nums.length; i++){
            if(temp.contains(nums[i]))  continue;
            temp.add(nums[i]);
            sol(res, temp, nums);
            temp.remove(temp.size()-1);
        }
    }