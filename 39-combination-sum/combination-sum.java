class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        solve(list,curr,candidates,target,0);
        return list;
    }
    public static void solve(List<List<Integer>>list,List<Integer>curr,int[]candidates,int target,int s){
         if(target<0){
            return;
         }
        if(target==0){
            list.add(new ArrayList<>(curr));
            return;
        }
        if(s==candidates.length){
            return;
        }
        for(int i=s;i<candidates.length;i++){
            curr.add(candidates[i]);
            solve(list,curr,candidates,target-candidates[i],i);
            curr.remove(curr.size()-1);
        }
    }
}