class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        int p=1;
        for(int i=0;i<nums.length;i++){
          arr[i]=p;
           p=p*nums[i];//1,1,2,6
        }
        int s=1;
        for(int i=nums.length-1;i>=0;i--){
           arr[i]=arr[i]*s;
            s=s*nums[i];
        }
        return arr;
    }
}