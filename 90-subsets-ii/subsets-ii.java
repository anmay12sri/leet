class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curlist = new ArrayList<>();
        Arrays.sort(nums); 
        backtrack(nums, 0, curlist, res);
        return res;
    }

    public static void backtrack(int[] nums, int s, List<Integer> curlist, List<List<Integer>> res) {
        res.add(new ArrayList<>(curlist));

        for (int i = s; i < nums.length; i++) {
             
            if (i > s && nums[i] == nums[i - 1]) {
                continue;
            }
            curlist.add(nums[i]);
            backtrack(nums, i + 1, curlist, res);
            curlist.remove(curlist.size() - 1);
        }
    }
}
