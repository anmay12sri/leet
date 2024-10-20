class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        backtrack(list,curr,0,nums);
        return list;
    }
    public static void backtrack(List<List<Integer>>list,List<Integer>curr,int s,int nums[]){
        list.add(new ArrayList<>(curr));

        for(int i=s;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(list,curr,i+1,nums);
             curr.remove(curr.size()-1);
        }
    }
}