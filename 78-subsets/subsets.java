class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        backtrack(list,curr,nums,0);
        return list;
    }
    public static void backtrack(List<List<Integer>>list,List<Integer>curr,int nums[],int k){
        list.add(new ArrayList<>(curr));

        for(int i=k;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(list,curr,nums,i+1);
            curr.remove(curr.size()-1);
        }
    }
}