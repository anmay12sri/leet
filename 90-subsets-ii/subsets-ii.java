class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list,curr,nums,0);
        return list;
    }
    public void backtrack(List<List<Integer>>list,List<Integer>curr,int nums[],int s){
        list.add(new ArrayList<>(curr));
        

        for(int i=s;i<nums.length;i++){
            if(i>s && nums[i]==nums[i-1]){
                continue;
            }
            curr.add(nums[i]);
            backtrack(list,curr,nums,i+1);
            curr.remove(curr.size()-1);
        }
        
    }
}