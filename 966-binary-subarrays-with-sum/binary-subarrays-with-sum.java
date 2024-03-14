class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        int presum=0;
        Map<Integer,Integer>map=new HashMap<>();

        for(int num:nums){
            presum+=num;
            if(presum==goal)count++;
        
        if(map.containsKey(presum-goal)){//3-2
           count+=map.get(presum-goal);
        }
        map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return count;
    }
}