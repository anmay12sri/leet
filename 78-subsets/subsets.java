class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>curr=new ArrayList<>();
        List<List<Integer>>list=new ArrayList<>();
        backtrack(list,curr,nums,0);
        return list;
    }
    public static void backtrack(List<List<Integer>>list,List<Integer>curr,int nums[],int s){
        list.add(new ArrayList<>(curr));

        for(int i=s;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(list,curr,nums,i+1);
            curr.remove(curr.size()-1);
            
        }

    }
}