class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        perm(list,curr,nums);
        return list;
    }
    public static void perm(List<List<Integer>>list,List<Integer>curr,int nums[]){
       if(curr.size()==nums.length){
        list.add(new ArrayList<>(curr));
        }
        for(int i=0;i<nums.length;i++){
            if(curr.contains(nums[i]))continue;
              curr.add(nums[i]);
                perm(list,curr,nums);
                curr.remove(curr.size()-1);
        }
        
    }
}