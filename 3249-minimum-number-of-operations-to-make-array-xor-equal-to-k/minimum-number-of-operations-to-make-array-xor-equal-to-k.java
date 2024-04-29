class Solution {
    public int minOperations(int[] nums, int k) {
        int count=0;
        int xor=0;

        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
        }
        if(xor==k){
            return 0;
        }
        int target=k^xor;

        while(target!=0){
           count++;
           target&=target-1;
        }
        return count;
    }
}