class Solution {
    public List<List<Integer>> permute(int[] nums) {
        // List<List<Integer>>list=new Arraylist<>();
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>curr=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        perm(list,curr,nums,freq);
        return list;
    }
    public static void perm(List<List<Integer>>list,List<Integer>curr,int nums[],boolean freq[]){
        if(curr.size()==nums.length){
            list.add(new ArrayList<>(curr));
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                curr.add(nums[i]);
                perm(list,curr,nums,freq);
                curr.remove(curr.size()-1);
                freq[i]=false;
            }
        }
    }
}