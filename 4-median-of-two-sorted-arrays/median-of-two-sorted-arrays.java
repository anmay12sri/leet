class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[]=new int[nums1.length+nums2.length];
        int n=nums1.length;
        int m=nums2.length;
         int i=0,j=0,k=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                merged[k++]=nums1[i++];
            }else{
                merged[k++]=nums2[j++];
            }
        }

            for(;i<n;i++){
                merged[k++]=nums1[i];
            }
            for(;j<m;j++){
                merged[k++]=nums2[j];

            }
            int x=merged.length;
            if(x%2==0){
                return (double)(merged[x/2]+merged[(x/2)-1])/2;
            }else{
                return merged[x/2];
            }

        
    }
}