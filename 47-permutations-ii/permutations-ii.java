class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
       List<List<Integer>>list=new ArrayList<>();
       List<Integer>curr=new ArrayList<>();
       boolean[]used=new boolean[nums.length];
       Arrays.sort(nums);
       backtrack(list,curr,nums,used);
       return list; 
    }
    public static void backtrack(List<List<Integer>>list,List<Integer>curr,int nums[],boolean used[]){
        if(curr.size()==nums.length){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]|| i>0 && nums[i]==nums[i-1] && !used[i-1])continue;
            curr.add(nums[i]);
            used[i]=true;
            backtrack(list,curr,nums,used);
            used[i]=false;
            curr.remove(curr.size()-1);

        }
    }
}