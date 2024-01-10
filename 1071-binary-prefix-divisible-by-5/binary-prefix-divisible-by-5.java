class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean>list=new ArrayList<>();
        int x=0;

        for(int i=0;i<nums.length;i++){
            x=(x*2+nums[i])%5;
            list.add(x==0);
        }
        return list;
    }
}