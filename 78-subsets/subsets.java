class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>curlist=new ArrayList<>();
        List<List<Integer>>list=new ArrayList<>();
        backtrack(nums,0,curlist,list);
        return list;
    }
    public static void backtrack(int nums[],int start,List<Integer>curlist,List<List<Integer>>list){
        list.add(new ArrayList<>(curlist));

        for(int i=start;i<nums.length;i++){
            curlist.add(nums[i]);
            backtrack(nums,i+1,curlist,list);
            curlist.remove(curlist.size()-1);
        }
    }
}