class Solution {
    public int findMaxLength(int[] nums) {
        int maxlen=0;
         
        int presum=0;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
            presum-=1;
           }else if(nums[i]==1){
            presum+=+1;
           }

           if(map.containsKey(presum)){
            int curlen=i-map.get(presum);
            maxlen=Math.max(curlen,maxlen);
           }else{
            map.put(presum,i);
           }
        }
        return maxlen;
    }
}