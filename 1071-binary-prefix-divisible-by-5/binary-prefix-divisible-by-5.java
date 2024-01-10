class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean>list=new ArrayList<>();
        int x=0;

        for(int i=0;i<nums.length;i++){
            x=(x*2+nums[i])%5;
            if(x==0){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}