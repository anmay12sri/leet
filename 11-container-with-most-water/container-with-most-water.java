class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=Integer.MIN_VALUE;

        while(l<r){
            int curr=Math.min(height[l],height[r])*(r-l);
            max=Math.max(curr,max);
            if(height[l]<height[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}