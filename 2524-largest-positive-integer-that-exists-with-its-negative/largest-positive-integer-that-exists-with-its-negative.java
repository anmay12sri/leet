class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
       int max=-1;
        for(int num:nums){
            set.add(num);
            int x=(-1)*num;
            if(set.contains(x)){
                max=Math.max(Math.abs(x),max);
            }
        }
        return max;
    }
}