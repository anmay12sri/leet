class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<Integer>list=new ArrayList<>();
       List<List<Integer>>listt=new ArrayList<>();
       backtrack(listt,list,nums,0);
       return listt; 
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