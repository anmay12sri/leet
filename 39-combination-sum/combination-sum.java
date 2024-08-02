class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer>curr=new ArrayList<>();
        List<List<Integer>>list=new ArrayList<>();
        backtrack(list,curr,candidates,target,0);
        return list;
    }
    public static void backtrack(List<List<Integer>>list,List<Integer>curr,int candidates[],int target,int s){
        if(target<0){
            return;
        }
        if(target==0){
            list.add(new ArrayList<>(curr));
            return;
        }
        for(int i=s;i<candidates.length;i++){
            curr.add(candidates[i]);
            backtrack(list,curr,candidates,target-candidates[i],i);
            curr.remove(curr.size()-1);
        }
         
    }
}