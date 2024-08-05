class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list,curr,nums,new boolean[nums.length]);
        return list;
    }
    public static void backtrack(List<List<Integer>>list,List<Integer>curr,int nums[],boolean used[]){
         if(curr.size()==nums.length && !list.contains(curr)){
            list.add(new ArrayList<>(curr));
            return;
         }
         for(int i=0;i<nums.length;i++){
            if(used[i])continue;
            curr.add(nums[i]);
            used[i]=true;
            backtrack(list,curr,nums,used);
            used[i]=false;
            curr.remove(curr.size()-1);
         }
    }
}