class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int actual_sum=(n*(n+1))/2;
        int arr_sum=0;
        int uni_sum=0;

        Set<Integer>set=new HashSet<>();
        for(int x:nums){
            arr_sum+=x;
        }
        for(int s:nums){
            set.add(s);
        }
        for(int y:set){
            uni_sum+=y;
        }
        int duplicate=arr_sum-uni_sum;
        int notpresent=actual_sum-uni_sum;


        return new int[]{duplicate,notpresent};
        
    }
}