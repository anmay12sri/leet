class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>temp=new ArrayList<>();
        List<List<Integer>>list=new ArrayList<>();
        backtrack(list,temp,nums,0);
        return list;

    }
    public static void backtrack(List<List<Integer>>list,List<Integer>temp,int nums[],int s){
        list.add(new ArrayList<>(temp));

        for(int i=s;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(list,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}