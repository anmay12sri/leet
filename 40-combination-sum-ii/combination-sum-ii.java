class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list,curr,candidates,target,0);
        return list;
    }
    public static void backtrack(List<List<Integer>>list,List<Integer>curr,int []candidates,int target,int s){
        if(target<0){
            return;
        }
        if(target==0){
            list.add(new ArrayList<>(curr));
        }
        for(int i=s;i<candidates.length;i++){
            if(i>s && candidates[i]==candidates[i-1]){
                continue;
            }
            if (candidates[i] > target) {
                break;
            }
            curr.add(candidates[i]);
            backtrack(list,curr,candidates,target-candidates[i],i+1);
            curr.remove(curr.size()-1);
        }
    }
}