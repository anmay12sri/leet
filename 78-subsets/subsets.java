class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>currlis=new ArrayList<>();

        backtrack(nums,0,currlis,list);
        return list;
    }
    public static void backtrack(int []nums,int start,List<Integer>currlis,List<List<Integer>>list){
        list.add(new ArrayList<>(currlis));
        for(int i=start;i<nums.length;i++){
            currlis.add(nums[i]);
            backtrack(nums,i+1,currlis,list);
            currlis.remove(currlis.size()-1);
        }
    }
}