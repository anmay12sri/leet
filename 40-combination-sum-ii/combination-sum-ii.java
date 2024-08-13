class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);// 1,1,2,5,6,7,10
        List<Integer>curr=new ArrayList<>();
        List<List<Integer>>list=new ArrayList<>();
        helper(list,curr,candidates,target,0);
        return list;
    }
    public void helper(List<List<Integer>>list,List<Integer>curr,int[]candidates,int target,int s){
        if(target<0){
            return;
        }
        if(target==0){
            list.add(new ArrayList<>(curr));
            return;
        }

        for(int i=s;i<candidates.length;i++){
            if(i>s && candidates[i]==candidates[i-1])continue;
             if(candidates[i]>target)continue;
            curr.add(candidates[i]);
            helper(list,curr,candidates,target-candidates[i],i+1);
            curr.remove(curr.size()-1);
        }
    }
}