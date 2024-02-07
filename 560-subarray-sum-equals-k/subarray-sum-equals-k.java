class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefsum=0;
        int count=0;
       
        Map<Integer,Integer>mp=new HashMap<>();
          mp.put(0,1);
        for(int i=0;i<nums.length;i++){
           prefsum+=nums[i];
           int remove=prefsum-k;
           // to get k
           if(mp.containsKey(remove)){
           count+=mp.get(remove);
           }
           mp.put(prefsum,mp.getOrDefault(prefsum,0)+1);
        }
        return count;
    }
}