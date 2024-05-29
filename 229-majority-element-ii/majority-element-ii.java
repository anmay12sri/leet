class Solution {
    public List<Integer> majorityElement(int[] nums) {
    // int x=0;
    Map<Integer,Integer>mp=new HashMap<>();
    List<Integer>li=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
         mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
       
       } 
    //    List<Integer>li=new ArrayList<>();
       for(Map.Entry<Integer,Integer>e:mp.entrySet()){
        int element=e.getKey();
        int count=e.getValue();
       if(count>nums.length/3){
        li.add(element);
        }
       }
       return li;
    }
}