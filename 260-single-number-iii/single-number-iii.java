class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[]=new int[2];
        Map<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int index=0;
        
      for(Map.Entry<Integer,Integer>e:map.entrySet()){
        int element=e.getKey();
        int count=e.getValue();
        
        if(count==1){
           arr[index]=element;
           index++;
          }
        }
      
      return arr;
    }
}