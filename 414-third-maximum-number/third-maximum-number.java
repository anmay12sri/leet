class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        Arrays.sort(nums);//1,2,2,3  1->target
       for(int i=0;i<nums.length-1;i++){
           if(nums[i]!=nums[i+1]){
             arr.add(nums[i]);
           }
       }
       arr.add(nums[nums.length-1]);//last wala remaining tha

       if(arr.size()<3){
           return arr.get(arr.size()-1);
       }
       return arr.get(arr.size()-3);
    }
}