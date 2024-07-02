class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>curlist=new ArrayList<>();
        List<List<Integer>>list=new ArrayList<>();
        backtrack(list,curlist,0,nums);
        return list;

    }
    public static void backtrack( List<List<Integer>>list,List<Integer>curlist,int start,int nums[]){
        list.add(new ArrayList<>(curlist));

        for(int i=start;i<nums.length;i++){
            curlist.add(nums[i]);
            backtrack(list,curlist,i+1,nums);
            curlist.remove(curlist.size()-1);
        }
    }
}