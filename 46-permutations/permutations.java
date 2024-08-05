class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // Arrays.sort(nums);
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        backtrack(nums,list,curr);
        return list;
        
    }
    public static void backtrack(int nums[],List<List<Integer>>list,List<Integer>curr){
        if(curr.size()==nums.length){
            list.add(new ArrayList<>(curr));
        }
        for(int i=0;i<nums.length;i++){
            if(curr.contains(nums[i]))continue;
            curr.add(nums[i]);
            backtrack(nums,list,curr);
            curr.remove(curr.size()-1);
        }
    }
}