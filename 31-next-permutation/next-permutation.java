class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind1=-1;
        int ind2=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
            if(ind1==-1){
                reverse(nums,0);
            }else{
                for(int i=n-1;i>=0;i--){
                    if(nums[ind1]<nums[i]){
                       ind2=i;
                       break;
                    }
                }
            
            swap(nums,ind1,ind2);
            reverse(nums,ind1+1);
            }

    }
    public void swap(int nums[],int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    public void reverse(int nums[],int start){
        int l=start;
        int r=nums.length-1;
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }
}