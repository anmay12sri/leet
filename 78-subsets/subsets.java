class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>currlist=new ArrayList<>();
        List<List<Integer>>list=new ArrayList<>();
        backtrack(nums,list,0,currlist);
        return list;
    }
    public static void backtrack(int nums[],List<List<Integer>> list,int start,List<Integer>currlist){
      list.add(new ArrayList<>(currlist));

      for(int i=start;i<nums.length;i++){
        currlist.add(nums[i]);
        backtrack(nums, list,i+1,currlist);
        currlist.remove(currlist.size()-1);
      }
    }
}