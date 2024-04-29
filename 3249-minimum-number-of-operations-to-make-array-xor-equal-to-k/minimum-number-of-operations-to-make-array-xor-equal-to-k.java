class Solution {
    public int minOperations(int[] nums, int k) {
        int count=0;
        int xor=0;

        for(int i=0;i<nums.length;i++){
            xor^=nums[i]; //pehle sabka xor kiya 0 aaya toh direct return 0 
        }
        if(xor==k){
            return 0;
        }
        int target=k^xor; // vrna k ke sath xor so that we will get to know how many minimum
        //flips we have to do to got its XOR==k

        while(target!=0){
           count++;
           target&=target-1;
        }
        return count;
    }
}