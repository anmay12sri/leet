class Solution {
    public int sumElement(int x){
        int sum=0;
        while(x!=0){
            int y=x%10;
            sum+=y;
            x/=10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int x:nums){
            min=Math.min(min,sumElement(x));
        }
        return min;
    }
}